/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package AyseSerraGumustakim_FatmaZehraTonga_minidesktopsearchengine;

import java.util.LinkedList;

/**
 *
 * @author EMRULLAH
 */
public class AyşeSerraGümüştakım_FatmaZehraTongaNodeClass {

    String word;
    AyseSerraGumustakim_FatmaZehraTongaLinkedlistClass fileList;
    AyşeSerraGümüştakım_FatmaZehraTongaNodeClass left;
    AyşeSerraGümüştakım_FatmaZehraTongaNodeClass right;

    public AyşeSerraGümüştakım_FatmaZehraTongaNodeClass(String word) {
        this.word = word;
        this.fileList = new AyseSerraGumustakim_FatmaZehraTongaLinkedlistClass();
        this.left = this.right = null;
    }

    public void addFile(String fileName) {
        fileList.add(fileName);
    }

    public LinkedList<String> getFileNames() {
        return fileList.getFileNames();
    }

    public LinkedList<Integer> getFrequencies() {
        return fileList.getFrequencies();
    }
}
