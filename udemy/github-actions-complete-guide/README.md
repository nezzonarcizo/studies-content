# GitHub Actions - The Complete Guide


## Section 1 - Getting Started

### Join the Discord Community!

Great to have you on board as a student!

This course also comes with free access to our “**Academind Community**” on Discord: [https://academind.com/community/]

---

There, you can find **more than 200.000 like-minded people**, **discuss** issues, **help each other**, share progress, successes and ideas and simply **have a good time**!

I believe that you learn the most if you **don’t learn alone** but find learning partners and other people with similar interests. Our community is a great place for this - it’s the perfect complimentary resource for this course.

**Joining it is of course free and 100% optional! :-)**


### Course Code Attachments & Slides

You find course resources (code snapshots & slides) on GitHub, in this repository: [https://github.com/academind/github-actions-course-resources]

The folders in the `Code` folder map to the different course sections.

The folders inside those subfolders (e.g., `Code/03 Events/01 Starting Project`) represent individual code snapshots - e.g., the starting project code for a course section.


### Course Setup

For following along with this course, you can use [VS Code](https://code.visualstudio.com/) - a free, extensible IDE that works on all operating systems.

A **popular alternative** are the [IDEs offered by Jetbrains](https://www.jetbrains.com/ides/#choose-your-ide). They offer a variety of IDEs for different programming languages and projects. For web development, [Webstorm](https://www.jetbrains.com/webstorm/) is a popular choice.

As a student of this course, you can get **one Jetbrains IDE for free** for six months!

All you need to do, is select it and enter the following coupon code on the checkout page: **ACAD_JETBRAINS**.

You find detailed instructions regarding the coupon code usage on [this page](https://sales.jetbrains.com/hc/en-gb/articles/206544449-Redeem-a-coupon-promo-code-or-discount-code).

*Please note: Using Jetbrains IDEs is optional (you could use VS Code)! If you do go for the Jetbrains deal, you'll need to enter your email address during the checkout process.*


## Section 2 - Git & GitHub Crash Course [Optional]

### Configuring Git

After installing Git, you can also configure it - most importantly, you can set a username and email address that will be connected to all your code snapshots.

This can be done via:

>`git config --global user.name "your-username"`

>`git config --global user.email "your-email"`

You can learn more about Git's configuration options here: [https://git-scm.com/docs/git-config]


## Section 3 - Basic Building Blocks & Components


### Events the trigger workflows

[https://docs.github.com/en/actions/reference/events-that-trigger-workflows]


### Storing GitHub Credentials (Personal Access Tokens) with Git Credential Manager

[https://github.com/git-ecosystem/git-credential-manager]


### GitHub Actions: Availability & Pricing

In **public repositories**, you can use GitHub Actions for **free**. For **private repositories, only a certain amount of monthly usage is available for free** - extra usage on top must be paid.

The exact quotas and payment details depend on your GitHub plan, a detailed summary can be found here: [https://docs.github.com/en/billing/managing-billing-for-github-actions/about-billing-for-github-actions]

If you can't find an "Actions" tab in your GitHub repository, you can should enable them as described here: [https://docs.github.com/en/repositories/managing-your-repositorys-settings-and-features/enabling-features-for-your-repository/managing-github-actions-settings-for-a-repository]


### GitHub Actions: Runners

[https://docs.github.com/pt/actions/concepts/runners/about-github-hosted-runners]


### Running Multi-Line Shell Commands

Thus far, you learned how to run simple shell commands like `echo "Something"` via `run: echo "Something"`.

If you need to run multiple shell commands (or multi-line commands, e.g., for readability), you can easily do so by adding the pipe symbol (`|`) as a value after the `run:` key.

Like this:

>...
>`run: |`
>    `echo "First output"`
>    `echo "Second output"`
>`This will run both commands in one step.`


### Checkout (Created by the GitHub Team)

[GitHub Repository -> Checkout Action](https://github.com/actions/checkout) - [View on Marketplace](https://github.com/marketplace/actions/checkout) - [GitHub Actions](https://github.com/features/actions)


### Preinstalled software for GitHub-owned images

[https://docs.github.com/en/actions/concepts/runners/about-github-hosted-runners#preinstalled-software-for-github-owned-images]


### Context Reference, Expressions & Functions

[Contexts Reference](https://docs.github.com/en/actions/reference/contexts-reference)

[Evaluate expressions in workflows and actions](https://docs.github.com/en/actions/reference/evaluate-expressions-in-workflows-and-actions)

[Functions](https://docs.github.com/en/actions/reference/evaluate-expressions-in-workflows-and-actions#functions)


## Section 4 - Workflows & Events - Deep Dive


### Events that triggers workflows

[https://docs.github.com/pt/actions/reference/events-that-trigger-workflows]


### Cheat Sheet

[https://docs.github.com/en/actions/reference/workflow-syntax-for-github-actions#filter-pattern-cheat-sheet]


### Skip workflow runs

[https://docs.github.com/en/actions/how-tos/managing-workflow-runs-and-deployments/managing-workflow-runs/skipping-workflow-runs]


## Section 5 - Job Artifacts & Outputs


### Upload Artifact

[https://github.com/actions/upload-artifact]


### Download Artifact

[https://github.com/actions/download-artifact]


### Cache

[https://github.com/actions/cache]


### MongoDB Atlas

[https://www.mongodb.com/products/platform/cloud]


### Store Information in Variables

[https://docs.github.com/en/actions/how-tos/writing-workflows/choosing-what-your-workflow-does/store-information-in-variables]


### Workflow Syntax - jobs.<job_id>.steps[*].shell

[https://docs.github.com/en/actions/reference/workflow-syntax-for-github-actions#jobsjob_idstepsshell]


## Section 6 - Using Environment Variables & Secrets


#### Default Environment Variables

You learned how to set and use your own environment variables.

GitHub Actions also provides a couple of default environment variables that are set automatically: [https://docs.github.com/en/actions/learn-github-actions/environment-variables#default-environment-variables]

These environment variable can, for example, give you quick access to the repository to which the workflow belongs, the name of the event that triggered the workflow and many other things.


### Secrets

[https://docs.github.com/pt/actions/how-tos/security-for-github-actions/security-guides/using-secrets-in-github-actions]


## Section 7 - Controlling Workflow & Job Execution


### Operators

[https://docs.github.com/en/actions/reference/evaluate-expressions-in-workflows-and-actions#operators]


## Section 8 - Jobs & Docker Containers


### Docker Hub - An exemple of public repository to use on Actions

[https://hub.docker.com/]


## Section 9 - Building & Using Custom Actions

### GitHub Actions Marketplace

[https://github.com/marketplace?type=actions]


### Metadata syntax for GitHub Actions

[https://docs.github.com/en/actions/reference/metadata-syntax-reference]


#### Runs for Javascript Actions

[https://docs.github.com/en/actions/reference/metadata-syntax-reference#runs-for-javascript-actions]


### Actions Toolkit

[https://github.com/actions/toolkit]


### Amazon AWS

[https://aws.amazon.com/]


### Granting read-only permission to a public anonymous user

[https://docs.aws.amazon.com/AmazonS3/latest/userguide/example-bucket-policies.html#example-bucket-policies-anonymous-user]


### AWS SDK for JavaScript

[https://aws.amazon.com/pt/sdk-for-javascript/]


### Metadata Syntax - `runs` for Docker container actions

[https://docs.github.com/en/actions/reference/metadata-syntax-reference#runs-for-docker-container-actions]


### Storing Actions In Repositories & Sharing Actions With Others

In this module, we created custom Actions that were stored in the same repository as our Workflow(s).

Alternatively, we could've stored the custom Actions in **separate repositories** (which therefore then only include the Action definition + code).

This is actually quite straightforward:

1. Create a new, local project folder which contains your `action.yml` file + all the code belonging to the action (Important: Don't put your `action.yml` file or code in a `.github/actions` folder or anything like that - just keep it directly on the root level of your created project!)

2. Add a local Git repository to your created project (via `git init`)

3. Create your commit(s) via `git add` and `git commit`

4. Create a GitHub repository and connect it to your local Git repository (via `git remote add`)

5. Add a tag via `git tag -a -m "My action release" v1`

6. Push your local code to the remote GitHub repository (via `git push --follow tags`)

7. Use your custom Action in any other Workflow (in any other project and repository) by referencing the repository which contains your action (e.g., `my-account/my-action@v1`)

If your custom Action is stored in a public repository, it can also be published to the GitHub Actions Marketplace as described here: [https://docs.github.com/en/actions/creating-actions/publishing-actions-in-github-marketplace#publishing-an-action]


## Section 10 - Security & Permissions

