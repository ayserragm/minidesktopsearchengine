/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AyseSerraGumustakim_FatmaZehraTonga_minidesktopsearchengine;

import java.util.HashMap;
import java.util.LinkedList;

/**
 *
 * @author EMRULLAH
 */
public class AyseSerraGumustakim_FatmaZehraTongaBinarySearchTreeClass {

    AyşeSerraGümüştakım_FatmaZehraTongaNodeClass root;
    
    public void insert(String word, String fileName, int frequency) {
    if (root == null) {
        root = new AyşeSerraGümüştakım_FatmaZehraTongaNodeClass(word);
        root.addFile(fileName);
    } else {
        AyşeSerraGümüştakım_FatmaZehraTongaNodeClass current = root;
        while (true) {
            if (word.compareTo(current.word) < 0) {
                if (current.left == null) {
                    current.left = new AyşeSerraGümüştakım_FatmaZehraTongaNodeClass(word);
                    current.left.addFile(fileName);
                    break;
                }
                current = current.left;
            } else if (word.compareTo(current.word) > 0) {
                if (current.right == null) {
                    current.right = new AyşeSerraGümüştakım_FatmaZehraTongaNodeClass(word);
                    current.right.addFile(fileName);
                    break;
                }
                current = current.right;
            } else {
                current.addFile(fileName);
                break;
            }
        }
    }
}

    AyşeSerraGümüştakım_FatmaZehraTongaNodeClass insertRec(AyşeSerraGümüştakım_FatmaZehraTongaNodeClass root, String word, String fileName, int frequency) {
        if (root == null) {
            root = new AyşeSerraGümüştakım_FatmaZehraTongaNodeClass(word);
            root.addFile(fileName);
            return root;
        }

        if (word.compareTo(root.word) < 0) {
            root.left = insertRec(root.left, word, fileName, frequency);
        } else if (word.compareTo(root.word) > 0) {
            root.right = insertRec(root.right, word, fileName, frequency);
        } else {
            root.addFile(fileName);
        }

        return root;
    }

    public AyşeSerraGümüştakım_FatmaZehraTongaNodeClass searchRec(AyşeSerraGümüştakım_FatmaZehraTongaNodeClass root, String word) {
        if (root == null || root.word == null) {
            return null;
        }

        if (word.equals(root.word)) {
            return root;
        }

        if (word.compareTo(root.word) < 0) {
            return searchRec(root.left, word);
        } else {
            return searchRec(root.right, word);
        }
    }

    public void inOrderTraversal(AyşeSerraGümüştakım_FatmaZehraTongaNodeClass node, StringBuilder result) {
        if (node != null) {
            inOrderTraversal(node.left, result);
            appendNodeDetails(node, result);
            inOrderTraversal(node.right, result);
        }
    }

    private void appendNodeDetails(AyşeSerraGümüştakım_FatmaZehraTongaNodeClass node, StringBuilder result) {
        result.append(node.word).append(": ");
        LinkedList<Integer> frequencies = node.getFrequencies();
        int totalFrequency = 0;
        for (Integer freq : frequencies) {
            totalFrequency += freq;
        }
        result.append(totalFrequency).append("\n");
    }

    public void preOrderTraversal(AyşeSerraGümüştakım_FatmaZehraTongaNodeClass node, StringBuilder result) {
        if (node != null) {
            appendNodeDetails(node, result);
            preOrderTraversal(node.left, result);
            preOrderTraversal(node.right, result);
        }
    }

    public void postOrderTraversal(AyşeSerraGümüştakım_FatmaZehraTongaNodeClass node, StringBuilder result) {
        if (node != null) {
            postOrderTraversal(node.left, result);
            postOrderTraversal(node.right, result);
            appendNodeDetails(node, result);
        }
    }
}
