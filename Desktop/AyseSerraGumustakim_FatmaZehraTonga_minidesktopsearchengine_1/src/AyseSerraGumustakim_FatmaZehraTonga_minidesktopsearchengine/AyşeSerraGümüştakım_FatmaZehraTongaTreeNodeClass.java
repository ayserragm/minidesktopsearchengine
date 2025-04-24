/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AyseSerraGumustakim_FatmaZehraTonga_minidesktopsearchengine;

import java.util.LinkedList;

/**
 *
 * @author EMRULLAH
 */
public class AyşeSerraGümüştakım_FatmaZehraTongaTreeNodeClass {
    
    private String data;
    private LinkedList<String> fileList;
    private AyşeSerraGümüştakım_FatmaZehraTongaTreeNodeClass leftChild;
    private AyşeSerraGümüştakım_FatmaZehraTongaTreeNodeClass rightChild;

    public AyşeSerraGümüştakım_FatmaZehraTongaTreeNodeClass(String data, String fileName) {
        this.data = data;
        fileList = new LinkedList<>();
        fileList.add(fileName);
        leftChild = null;
        rightChild = null;
    }

    public void insert(String fileName) {
        fileList.add(fileName);
    }

    public LinkedList<String> getFileList() {
        return fileList;
    }

    public String getData() {
        return data;
    }

    public AyşeSerraGümüştakım_FatmaZehraTongaTreeNodeClass getLeftChild() {
        return leftChild;
    }

    public void setLeftChild(AyşeSerraGümüştakım_FatmaZehraTongaTreeNodeClass leftChild) {
        this.leftChild = leftChild;
    }

    public AyşeSerraGümüştakım_FatmaZehraTongaTreeNodeClass getRightChild() {
        return rightChild;
    }

    public void setRightChild(AyşeSerraGümüştakım_FatmaZehraTongaTreeNodeClass rightChild) {
        this.rightChild = rightChild;
    }
    
}
