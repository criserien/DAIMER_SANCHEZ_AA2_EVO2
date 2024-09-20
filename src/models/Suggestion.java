package models;

public class Suggestion {
    private int suggestionId;
    private String name;
    private String email;
    private String suggestionText;
    private String submissionDate;

    // Constructor vacío
    public Suggestion() {
    }

    // Constructor con parámetros
    public Suggestion(int suggestionId, String name, String email, String suggestionText, String submissionDate) {
        this.suggestionId = suggestionId;
        this.name = name;
        this.email = email;
        this.suggestionText = suggestionText;
        this.submissionDate = submissionDate;
    }

    // Getters y Setters
    public int getSuggestionId() {
        return suggestionId;
    }

    public void setSuggestionId(int suggestionId) {
        this.suggestionId = suggestionId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSuggestionText() {
        return suggestionText;
    }

    public void setSuggestionText(String suggestionText) {
        this.suggestionText = suggestionText;
    }

    public String getSubmissionDate() {
        return submissionDate;
    }

    public void setSubmissionDate(String submissionDate) {
        this.submissionDate = submissionDate;
    }

    // Método toString para representar la sugerencia
    @Override
    public String toString() {
        return "Suggestion [suggestionId=" + suggestionId + ", name=" + name + ", email=" + email
                + ", suggestionText=" + suggestionText + ", submissionDate=" + submissionDate + "]";
    }
}