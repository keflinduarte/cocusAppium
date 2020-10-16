package screens;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.WithTimeout;

import java.util.concurrent.TimeUnit;

public class NotesScreen extends BaseScreen {

    @WithTimeout(time = 5000, unit = TimeUnit.SECONDS)

    @AndroidFindBy(id = "com.example.android.testing.notes.mock:id/toolbar")
    private MobileElement titleNotes;

    @AndroidFindBy(id = "com.example.android.testing.notes.mock:id/fab_add_notes")
    private MobileElement btnPlus;

    @AndroidFindBy(id = "com.example.android.testing.notes.mock:id/add_note_title")
    private MobileElement addNoteTitle;

    @AndroidFindBy(id = "com.example.android.testing.notes.mock:id/add_note_description")
    private MobileElement addNoteDescription;

    @AndroidFindBy(id = "com.example.android.testing.notes.mock:id/fab_add_notes")
    private MobileElement btnConfirm;

    @AndroidFindBy(id = "com.example.android.testing.notes.mock:id/note_detail_title")
    private MobileElement noteCard;

    public void checkApp() {
        this.titleNotes.isDisplayed();
    }

    public void addNotes() {
        this.btnPlus.click();
    }

    public void checkNoteTitleDisplayed() {
        this.addNoteTitle.isDisplayed();
    }

    public void addNoteTitle(String value) {
        this.addNoteTitle.sendKeys(value);
    }

    public void addNoteDescription(String value) {
        this.addNoteDescription.sendKeys(value);
    }

    public void clickConfirmNotes() {
        this.btnConfirm.click();
    }

    public void checkNoteCard() {
        this.noteCard.isDisplayed();
    }
}
