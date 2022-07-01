package com.scriptwritr.model;

public class Dialogue {

    private int dialogueID;
    private String dialogue;

    public Dialogue(int dialogueID,String dialogue) {
        this.dialogueID = dialogueID;
        this.dialogue = dialogue;
    }

    public String getDialogue() {
        return dialogue;
    }

    public void setDialogue(String dialogue) {
        this.dialogue = dialogue;
    }

    public int getDialogueID() {
        return dialogueID;
    }

    public void setDialogueID(int dialogueID) {
        this.dialogueID = dialogueID;
    }

    @Override
    public String toString() {
        return "\n" + dialogue;
    }
}
