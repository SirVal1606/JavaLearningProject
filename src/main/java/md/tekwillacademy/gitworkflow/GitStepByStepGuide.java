package md.tekwillacademy.gitworkflow;

public class GitStepByStepGuide {
    public static void main(String[] args) {
        String step1= "Execute - git stash command  in order to save the changes";
        String step2= "Go to the main branch - git checkout master";
        String step3= "Get the latest changes - sync with Origin/master - git fetch";
        String step4= "Download the differences, if any - git pull";
        String step5= "Create a new branch for the task - git checkout -b *branch name*";
        String step6= "Add code changes for the required task";
        String step7= "Save the changes on local memory - git commit";
        String step8= "Upload the changes on the cloud - git push";
        String step9= "Go to GitHub repository";
        String step10= "Create a new pull request into the origin/master branch";
        String step11= "Invite the collaborators to review the code";
        String step11_1= "If changes are required, then the last commit will be adjusted using GIT commit amend";
        String step11_2= "In case of GIT commit amend, GIT force should be performed in order to update the remote branch and the existing pull request";
        String step12= "Merge the code";
        String step13= "Delete the created secondary branch as it is already merged";
        String step14= "Go to Intellij Idea and checkout the master branch - git checkout master";
        String step15= "Download the latest version of origin/master - git fetch + git pull";
        System.out.println(step1);
        System.out.println(step2);
        System.out.println(step3);
        System.out.println(step4);
        System.out.println(step5);
        System.out.println(step6);
        System.out.println(step7);
        System.out.println(step8);
        System.out.println(step9);
        System.out.println(step10);
        System.out.println(step11);
        System.out.println(step11_1);
        System.out.println(step11_2);
        System.out.println(step12);
        System.out.println(step13);
        System.out.println(step14);
        System.out.println(step15);


    }




}
