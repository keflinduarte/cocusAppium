package StepsDefinitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import screens.NotesScreen;

public class NotesSteps {

    NotesScreen notes;

    public NotesSteps() {
        notes = new NotesScreen();
    }

    @Given("^I open Notes app$")
    public void iOpenNotesApp() {
        this.notes.checkApp();
    }

    @When("^I click on plus button to add a new note$")
    public void iClickOnPlusButtonToAddANewNote() {
        this.notes.addNotes();
    }

    @Then("^New Note screen is open$")
    public void newNoteScreenIsOpen() {
        this.notes.checkNoteTitleDisplayed();
    }

    @When("^Enter \"([^\"]*)\" as note title$")
    public void enterAsNoteTitle(String value) throws Throwable {
        this.notes.addNoteTitle(value);
    }

    @And("^Enter \"([^\"]*)\" as note description$")
    public void enterAsNoteDescription(String value) throws Throwable {
        this.notes.addNoteDescription(value);
    }

    @And("^Click on Confirm button$")
    public void clickOnConfirmButton() {
        this.notes.clickConfirmNotes();
    }

    @Then("^The note is added$")
    public void theNoteIsAdded() {
        this.notes.checkNoteCard();
    }
}
