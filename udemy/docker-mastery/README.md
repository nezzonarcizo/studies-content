# Docker Mastery: with Kubernetes + Swarm from a Docker Captain

## 1 - Quick Start!

### Kubernetes vs Docker

[https://www.bretfisher.com/kubernetes-vs-docker/]


### About the Open Container Initiative

[https://opencontainers.org/about/overview/]


### What is Docker in 2025? (Class on GitHub)

[https://github.com/BretFisher/udemy-docker-mastery/blob/main/intro/what-is-docker/what-is-docker.md]


***Main Concepct: Build -> Ship -> Run***


### Play with Docker

[https://labs.play-with-docker.com/]


### Docker Hub

[https://hub.docker.com/]


### Docker Docs - Official Images

[https://docs.docker.com/docker-hub/repos/manage/trusted-content/official-images/]


### Apache httpd Image

[https://hub.docker.com/_/httpd]


### Quick Container Run (Class on GitHub)

[https://github.com/BretFisher/udemy-docker-mastery/blob/main/intro/quick-container-run/quick-container-run.md]


### A Brief History of Containers: From 1970s Till Now

[https://www.aquasec.com/blog/a-brief-history-of-containers-from-1970s-chroot-to-docker-2016/]


### Why Docker? Why Now in 2025? (Class on GitHub)

[https://github.com/BretFisher/udemy-docker-mastery/blob/main/intro/why-docker/why-docker.md]


## 2 - Course Introduction

### GitHub Repository for this Course

[https://github.com/bretfisher/udemy-docker-mastery]

### Getting Course Resources (GitHub Repo)

>All examples and assignment files are in a single code repository at
>github.com/bretfisher/udemy-docker-mastery. Each folder represents a
>single lecture video (but not all lectures have a folder, as not all
>need code). You should clone this repo into your user profile somewhere
>on your host. (c:/Users/username/  on Windows, and /Users/username  on
>Mac). Having inside your user profile will ensure Docker works correctly
>on Mac and Windows. The location doesn't matter for Linux hosts, as
>long as you have permissions to clone it to that directory. git clone
>https://github.com/BretFisher/udemy-docker-mastery.git 
>
>If you're rather new
>to GitHub, you can download the GUI to make it very easy to push/pull code
>at https://desktop.github.com/ for Mac and Windows. A great alternative Git
>client is https://www.gitkraken.com/.  
>
>We won't use git much in this course
>but knowing the basics of pulling code, committing code, and pushing updates
>could be helpful at times in the course.


### Course Chat with Students Learning Containers

>🎉Get more out of this course by getting live help from other students
>and chatting with my DevOps community.
>
>Discord - Cloud Native DevOps I've used IRC, Hip Chat, Slack, and now Discord
>for my communities over the decades. Discord has become so awesome in recent
>years as a "safe space" for open communities, that it's my favorite chat
>system for open source communities.
>
>Join my "Cloud Native DevOps" Discord server with 16,000+ members and
>gain access to a special channel for this course under "COURSE HELP":
>https://devops.fan


### YouTube Live Q&A with Bret

>Yep I'm this excited about doing YouTube Live with you.  If you're just
>starting the course, or even already finished with the courses and have
>questions, I invite you to join me for an "Ask Me Anything" style of
>hangout. Every week (usually Thursday's) I spend an hour answering your
>questions about this course, containers, and general DevOps topics. It's
>scheduled and announced on my YouTube Channel, so **be sure to subscribe and
>then click the bell to get alerts.**
>
>[Hope to see you there!](https://www.youtube.com/channel/UC0NErq0RhP51iXx64ZmyVfg)


### The Big FAQ

>This course has over 5,000 a month taking it! That's amazing to me. It
>also means we get lots of the same questions. Some are just things I didn't
>explain clearly. Some are minor issues people hit along the way. Here's the
>most common Q&A in order of frequency.
>
>**NOTE: Don't read all these now, but remember to come back when you hit an
>issue, This list is the FASTEST way to solve your issues for common course
>troubles.**
>
>#### Bind for 0.0.0.0:80 failed: port is already allocated. -OR- port already in
>#### use -OR- permission denied.  
>
>This will happen if you are attempting to start a
>new container with a port that is already in-use on your machine. Remember in
>TCP/UDP, only one application/service can use a single IP+PORT at a time. This
>doesn’t change with containers when you use -p  to bind to the host IP+PORT.
>
>**You'll need to either stop the app that's using that port, or just run your
>container on a different (available) port.**
>
>First run `docker ps` to check if there are any containers using this port -
>if there are not; you likely have a non-Docker related application running
>on your machine that is using this port. Maybe IIS, maybe Apache, etc.
>
>If you are on a Mac, you can check what is using the port with the command:
>`lsof -i :<port>`
>
>If you are on Windows, you can check what is using which port with: `netstat`
>
>Of course - if you don’t have a reason to specifically use the port that
>is throwing this error, simply run your container on another port. Remember,
>the syntax is `<host port>:<container port>`  , so binding to port 8888 on
>your host machine with a container that uses port 80, would look like:
>`docker container run -p 8888:80 your_image`
>
>What happened to Docker Toolbox?  It was deprecated by Docker in lieu of
>Docker Desktop, which now works on all editions of Windows 10/11, macOS,
>and Linux Desktop.  If you want a multi-node setup locally, then [Multipass](https://canonical.com/multipass)
>is a good replacement for Toolbox.
>
>#### $(pwd) in Windows is getting an error for bind-mounts: C:\Program Files\Docker
>#### Toolbox\docker.exe: invalid reference format.  
>
>First, you should no longer be
>using CMD.exe (Command Prompt) or PowerShell for Docker commands, because it
>tends to be a lot easier to just run them from a WSL Linux (bash/zsh) command
>where `$(pwd)` will work. But, if you'd like more info on the "why", read on.
>
>PowerShell has a few minor differences in command format. This is a PowerShell
>thing, not a docker thing. When using the shell path shortcut "pwd":
>
>For PowerShell use: `${pwd}`
>
>For cmd.exe "Command Prompt use: `%cd%`
>
>bash, sh, zsh, and Docker Toolbox Quickstart Terminal use: `$(pwd)`
>
>Note, if you have spaces in your path, you'll usually need to quote the
>whole path in the docker command.
>
>There's another issue sometimes seen, where other apps can mess up your path:
>[https://stackoverflow.com/questions/50608301/docker-mounted-volume-adds-c-to-end-of-windows-path-when-translating-from-linux]
>
>#### I hit Ctrl-C in Windows, and the Container is still running 
>
>I recommend you
>use WSL Linux with bash or zsh to avoid this quirky inconsistency. If you'd
>like to know more, read on:
>
>In Windows, there's a quirk with the built-in Powershell and Command Prompt
>terminals. They don't interpret ctrl-c the same way as Linux, Unix, and
>macOS. They won't shutdown the container, and you'll need to use 
>`docker stop` commands.
>
>#### How do I cleanup space (images etc.)?  
>
>Run prune commands https://www.udemy.com/docker-mastery/learn/v4/t/lecture/7407918?start=0
>
>#### Bind Mount Won't Show Up In Container 
>
>This is usually a Docker for Windows
>issue, where you need to go into Docker Settings GUI (lower right icon)
>and uncheck the drive where your code is, then save, and then re-check that
>drive to re-apply the file sharing permissions between the Linux VM and the
>Windows OS.
>
>#### Starting container process caused "exec: \"ping\": executable file not found
>#### in $PATH": unknown 
>
>That error is telling you that ping is not available in
>the image you’re trying to run it from. Official images have changed over
>time and the official nginx default image (nginx:latest) no longer has ping
>in it by default.  Image nginx:alpine should still have ping installed (a
>few of my videos show utilities like ping that are no longer in those images).
>
>If it's a debian-based image (the default nginx) then you can also use 
>`apt-get update && apt-get install -y iputils-ping` inside the container to install it.
>
>Lastly, I keep a “bunch of troubleshooting and handy admin utilities”
>in an image here that you can run ping from: `bretfisher/netshoot`
>
>[https://www.udemy.com/docker-mastery/learn/v4/questions/3751216]
>
>#### Starting mysql container and running ps causes "ps: command not found"
>
>Like above, this is the container shell telling you the binary "ps" isn't
>in your path, and not installed in the container. Docker changed the mysql
>image after the video was recorded and removed the ps utility. You can add
>it back in using the apt package manager.
>
>`apt-get update && apt-get install procps`
>
>For more info:
[>https://stackoverflow.com/questions/26982274/ps-command-doesnt-work-in-docker-container]
>
>#### How to run two container websites on a single port in Docker or Swarm services
>
>This is a bit more advanced, but common for production Swarms. You'll need a
>"reverse proxy"
>
>[https://www.udemy.com/docker-mastery/learn/v4/questions/3931678]
>
>#### Error response from daemon: pull access denied.  
>
>Double and triple-check
>the spelling of the image you are pulling; if you are attempting to pull a
>publicly hosted image - this error will not occur, but if there is a typo
>and Docker can’t find the image - it will expect that it is a private
>image and ask you to login.
>
>Also, there are times when the config.json file gets messed up, so try
>docker logout && docker login. If all that still causes the same issue,
>try removing `~/.docker/config.json`  and then pull again.
>
>#### Kubernetes vs. Swarm.
>
>I have a dedicated lecture for this:
>
>[https://www.udemy.com/course/docker-mastery/learn/lecture/15094976]
>
>#### Does this help with Docker Certified Associate?
>
>Yes, but it’s not a study guide. Here’s the Lecture with info:
>[https://www.udemy.com/docker-mastery/learn/v4/t/lecture/9485678?start=0]
>
>#### Ubuntu Container vs. Ubuntu OS, What's the Difference?
>[https://www.udemy.com/docker-mastery/learn/v4/questions/5390204]
>
>#### How to use volumes in Swarm for databases.
>[https://www.udemy.com/docker-mastery/learn/v4/questions/2675184]
>
>#### How do we do backups in docker?
>[https://www.udemy.com/docker-mastery/learn/v4/questions/2756448]
>
>#### Getting a shell in VM’s that run Docker Workaround:
>[https://www.udemy.com/docker-mastery/learn/v4/questions/3860412]
>
>`docker run -it --rm --privileged --pid=host justincormack/nsenter1`
>
>macOS [https://www.bretfisher.com/docker-for-mac-commands-for-getting-into-local-docker-vm/]
>
>Docker for Windows [https://www.bretfisher.com/getting-a-shell-in-the-docker-for-windows-vm/]
>
>Docker Toolbox `docker-machine ssh default`
>
>#### Windows firewalls preventing networking or bind mounts in containers
>[https://www.udemy.com/docker-mastery/learn/v4/questions/3258290]
>
>#### Anti-Virus Blocking file sharing in Windows
>[https://www.udemy.com/docker-mastery/learn/v4/questions/3442460]
>
>#### Are containers more secure than VM’s?
>[https://www.udemy.com/docker-mastery/learn/v4/questions/4020880]
>
>#### I have a network proxy and images won’t build
>[https://stackoverflow.com/questions/23111631/cannot-download-docker-images-behind-a-proxy/]
>
>#### Public vs. Private IP for Swarm advertise-addr and data-path-addr
>[https://www.udemy.com/docker-mastery/learn/v4/questions/3710518]
>
>#### Custom Docker Networks, macvlan and IP setting hardcoding
>[https://www.udemy.com/docker-mastery/learn/v4/questions/3706540]


### The Main Differences Between VM and Docker

| **Feature**             | **Virtual Machines (VMs)**                   | **Docker Containers**                          |
|-------------------------|----------------------------------------------|------------------------------------------------|
| **Architecture**        | Includes full OS, kernel, and app           | Shares host OS kernel, runs isolated apps      |
| **Size**                | Large (gigabytes)                           | Small (megabytes)                              |
| **Startup Time**        | Minutes                                     | Seconds                                        |
| **Performance**         | Slower due to full OS overhead              | Faster due to lightweight isolation            |
| **Resource Usage**      | High (needs CPU, memory for full OS)        | Low (shares host OS resources)                 |
| **Isolation**           | Strong (via hypervisor)                     | Moderate (via namespaces and cgroups)          |
| **Portability**         | Less portable due to OS differences         | Highly portable across environments            |
| **Use Case**            | Ideal for full OS-level virtualization      | Ideal for microservices and lightweight apps   |
| **Management**          | With hypervisors (e.g., VMware, KVM)        | With container tools (e.g., Docker, K8s)       |
| **Security**            | Strong (full OS isolation)                  | Moderate (kernel shared with host)             |


## 3 - The Best Way to Setup Docker for your OS


### Local Container Runtimes in 2024: Tools for Running Containers for Local Dev

[https://docs.google.com/spreadsheets/d/1ZT8m4gpvh6xhHYIi4Ui19uHcMpymwFXpTAvd3EcgSm4/edit?gid=0#gid=0]


### Docker Desktop

[https://docs.docker.com/desktop/]


### OCI: Open Container Initiative

[https://opencontainers.org/]


### Installing Docker: The Fast Way

>#### Installing Docker, Kubernetes, and a text editor 
>
>If you don't already have Docker installed, Docker already has some 
>[great guides on how to do it](https://docs.docker.com/get-started/get-docker/),
>but if you already know which OS you want to install on, 
>below are quick steps for downloading it. The videos after this Lecture 
>are walkthroughs of installing Docker for each OS, then getting the GitHub repo, 
>getting a code editor, and tweaking the command line if you want to. 
>`Feel free to skip any of this Section if you have Docker Desktop and Visual Studio Code already installed.`
>
>**I always recommend** [Visual Studio Code (vscode) as your editor](https://code.visualstudio.com/) for all things
>Docker, Kubernetes, and DevOps. It's free for all OSs and has plugins to
>help you with many tools in this course.
>
>#### Installing on Windows 10 and Windows 11 (any Edition)
>[https://docs.docker.com/desktop/windows/install/]
>
>This is the best experience on Windows, which [uses WSL2](https://learn.microsoft.com/en-us/windows/wsl/install). 
> If you're new to >WSL2, it's the best way to run Linux on Windows, and Docker Desktop will walk
>you through enabling it. Docker can technically still work on Hyper-V with
>"Windows Containers," but most of this course focuses on Linux Containers,
>which WSL2 is great at.
>
>After installing [Docker Desktop for Windows](https://docs.docker.com/desktop/setup/install/windows-install/). 
>I recommend installing a Windows
>Store [Ubuntu for WSL2](https://apps.microsoft.com/detail/9pdxgncfsczv?hl=en-US&gl=US) 
> distro and using its shell in [Windows Terminal](https://apps.microsoft.com/detail/9n0dx20hk701?hl=en-US&gl=US#activetab=pivot:overviewtab) 
> is the best CLI experience! Make sure to check your Docker Desktop settings to give
>it enough resources and enable all your WSL2 distros for Docker Desktop.
>
>#### Installing on Windows 7 or Windows 8 
>Unfortunately, Microsoft's OS features for
>Docker Desktop don't work in these older versions. You'll need to use Hyper-V
>or install VirtualBox and manually setup a Linux VM. It's more involved
>than the other options, so I often recommend the easier option: using a
>DigitalOcean cloud server with my coupon code [https://m.do.co/c/b813dfcad8d4]
>gets you $100 in credits over 60 days.
>
>#### Installing on Mac 
>[https://docs.docker.com/desktop/mac/install/]
>
>You'll want to install [Docker Desktop for Mac](https://docs.docker.com/desktop/setup/install/mac-install/), 
> which is great.
>
>#### Installing on Linux Desktop 
>**2022 update**: Docker Desktop for Linux is here!
>
>[https://docs.docker.com/desktop/linux/install/]
>
>#### Installing on Linux Server 
>[https://docs.docker.com/engine/install/]
>
>**Do *not* use your built-in default packages**  `apt/yum install docker.io`
>because those packages are old and not the Official Docker-Built packages.
>
>I prefer to use [Docker's automated script](https://get.docker.com/) 
>to add their repository and install
>all dependencies: `curl -sSL https://get.docker.com/ | sh`  but you can also
>install in a more manual method by following specific instructions that
>Docker provides [for your Linux distribution](https://docs.docker.com/engine/install/).
>
>#### Use Play With Docker 
>[https://labs.play-with-docker.com/]
>
>Maybe you don't have local admin, or maybe your machine doesn't have enough
>resources. Well, the best free option here is to use 
>[play-with-docker.com](http://play-with-docker.com/),
>which will run one or more Docker instances inside your browser, and give
>you a terminal to use it with. You can create multiple machines on it and
>even use the URL to share the session with others in a sort of collaborative
>experience.  I highly recommend you check it out.  Most of the lectures in
>this course can be used with "PWD," 
>**but the big limitation is it'll reset after 4 hours, at which time it'll delete your servers**.
>
>#### Use DigitalOcean as a remote Linux Server
>If you signup for a new account
>with DigitalOcean, my favorite "simpler" cloud, you can use a smaller server
>for months with my signup credit. 
>**Install Docker in the Cloud, via the above Linux links, and do the course without needing Docker locally.** 
>Thousands of students have done this:
>
>[https://m.do.co/c/b813dfcad8d4] gets you $100 in credits over 60 days


### Install Docker Desktop on Windows

[https://docs.docker.com/desktop/setup/install/windows-install/]


### Local Container Runtimes in 2024: Tools for Running Containers for Local Dev

[https://docs.google.com/spreadsheets/d/1ZT8m4gpvh6xhHYIi4Ui19uHcMpymwFXpTAvd3EcgSm4/edit?gid=0#gid=0]


### Docker for Windows: Setup and Tips (Class on GitHub)

[https://github.com/BretFisher/udemy-docker-mastery]


### Install Docker Desktop on Mac

[https://docs.docker.com/desktop/setup/install/mac-install/]


### Docker for Mac: Setup and Tips (Class on GitHub)

[https://github.com/BretFisher/udemy-docker-mastery]


### Install Docker on Linux

[https://docs.docker.com/desktop/setup/install/linux/]


### Docker for Linux Desktop: Setup and Tips (Class on GitHub)

[https://github.com/BretFisher/udemy-docker-mastery]


### Install Docker Engine

[https://docs.docker.com/engine/install/]


### Docker for Linux Server: Setup and Tips (Class on GitHub)

[https://github.com/BretFisher/udemy-docker-mastery]


### Docker Extension for VS Studio Code

[https://marketplace.visualstudio.com/items?itemName=ms-azuretools.vscode-docker]


### Kubernetes Extension for VS Studio Code

[https://marketplace.visualstudio.com/items?itemName=ms-kubernetes-tools.vscode-kubernetes-tools]


### Remote Development Extension for VS Studio Code

[https://marketplace.visualstudio.com/items?itemName=ms-vscode-remote.vscode-remote-extensionpack]


### Live Share Extension for VS Studio Code

[https://marketplace.visualstudio.com/items?itemName=MS-vsliveshare.vsliveshare]


### Docker Version and Products Changes

>Docker Version and Products Changes Over the years of this course, there
>have been changes in Docker Inc, what products they still support, versions,
>product names, licensing, and even the purpose of the company. Here are the
>big changes over the years:
>
>**Docker CLI is backward compatible, so the latest version works with all commands shown in this course, regardless of which version.**
>
>**2022** [Docker Desktop for Linux](https://docs.docker.com/desktop/setup/sign-in/) 
>**is launched**! Also, Docker Desktop gets Extensions
>for adding 3rd party features to the GUI.
>
>**2021** Docker Desktop licensing changes to [require a subscription](https://www.docker.com/pricing/) for use in large companies (more than 250 employees OR more than $10 million USD in
>annual revenue). **Docker Desktop is still 100% free while learning Docker and Kubernetes in this course, which I have personally verified with the Docker Inc. team that it's 100% free for personal use and learning setups**. See more
>in their [pricing FAQ](https://www.docker.com/pricing/faq/).
>
>**2021** [Docker Compose](https://github.com/docker/compose) **is getting rebuilt as a Docker CLI plugin, called Compose V2**, rather than a stand-alone Python binary. It's faster and better. The
>command `docker compose` (space between) supersedes `docker-compose` (if you are
>using Docker Desktop, it's auto installed). **Both Compose commands work the same for now**, 
>but V2 is starting to get new features like `docker compose ls`.
>
>**2020 Docker Machine and Docker Toolbox are deprecated and archived**. They
>might still work but are not receiving updates. Docker Desktop now works
>on Windows WSL2 and Home editions, so **all Windows 10/11 editions are best with Docker Desktop**. 
>As a backup plan or for local multi-VM management, use
>[Multipass](https://canonical.com/multipass) to quickly install multiple Ubuntu VMs and then manually install Docker like you would [on a Linux server](https://docs.docker.com/engine/install/).
>
>**2019** Docker Inc's paid server products (Docker Datacenter, DTR, Docker
>for Windows Server, and Docker Enterprise) **were** [sold to Mirantis](https://www.mirantis.com/software/mirantis-kubernetes-engine/). Nothing changes in Docker's desktop products or open source. **Docker Inc. now focuses on developer tools and gets out of the paid server product market.**
>
>**2019** Many **product name changes**. "Docker for Mac" and "Docker for Windows"
>are now just Docker Desktop. Docker CE and Docker EE are now just Docker
>Engine and Docker CLI. There are no more Edge, Beta, or Community versions
>of things.  Get more info on [release channels of Docker Engine here](https://docs.docker.com/engine/install/#release-channels).
>
>**2017** Versions are now `YY.MM`  based (like Ubuntu). There may be mentions
>of `1.12`  and `1.13`  in this course, which were the two versions before the
>date-based version changes.


## 4 - Creating and Using Containers Like a Boss


### Mike Coleman (Docker Employee) - Docker for the Virtualization (Admin eBook)

[https://github.com/mikegcoleman/docker101/blob/master/Docker_eBook_Jan_2017.pdf]


### Cgroups, namespaces, and beyond: What are containers made from?

[https://www.youtube.com/watch?v=sK5i-N34im8&list=PLBmVKD7o3L8v7Kl_XXh3KaJl9Qw2lyuFl]


### Docker Desktop for Mac Commands for Getting Into The Local Docker VM

[https://www.bretfisher.com/docker-for-mac-commands-for-getting-into-local-docker-vm/]


### Getting a Shell in the Docker for Windows Moby VM

[https://www.bretfisher.com/getting-a-shell-in-the-docker-for-windows-vm/]


### Windows Containers: Should You Consider Them?

>Containers are really just restricted processes running on the OS kernel. 
>The executable files in those containers have to be built for the kernel they are running on. 
>For example, a Python image built for `linux/x86_64` won't run as a python.exe on a Windows
>kernel. This is why Docker Desktop uses a lightweight Linux VM to run your
>containers.
>
>From Docker's inception in 2013 to 2016, we could build images for multiple
>architectures (amd64, arm/v6, arm/v7, i386, etc.) but not for the Windows
>kernel itself. Docker was Linux-only.
>
>In 2016 we got "Windows Containers" support from Microsoft.
>
>(sadly, there's no sign that we'll ever get "macOS Containers" from Apple.)
>
>**To be clear, in this course, even on Windows with WSL, is running Linux-based images.**
>
>Today Docker is more than Linux. When you think of images, realize
>they are always kernel (Linux/Windows) and architecture (arm64, amd64,
>etc.) specific. Docker does this seamlessly in the background with a
>"manifest". It downloads the best image for the platform your Docker Engine
>is running on. Check out the `--platform` command for forcing a different
>image than your platform's native kernel with `docker run --help | grep platform`
>
>**This course still focuses on Linux x64 images because 95% of the concepts are the same**, 
>but "Windows Containers" are possible with Windows-based
>binaries. Technically, they are native Windows .exe binaries running in
>Docker containers on a Windows kernel, and have no Linux installed. They
>use PowerShell.exe or CMD.exe in the Dockerfile `RUN` commands.
>
>You can enable Windows Container mode in Docker Desktop for Windows by clicking
>"Switch to Windows containers" in the Docker whale menu, which then switches
>from WSL2 to Hyper-V running a slim Windows VM. It's an either-or setting,
>so you'll want to switch back to "Linux containers" mode for this course.
>
>On Windows Server 2016 and newer, where you don't have Docker Desktop,
>you'll need to [pick which container runtime to install](https://learn.microsoft.com/en-us/virtualization/windowscontainers/quick-start/set-up-environment?tabs=dockerce#install-docker), 
>and then you have two ways to run containers. Natively on the host kernel without VMs, 
>called "process-isolation" mode, and the default "Hyper-V isolation" mode. 
>[Read here for more on isolation modes](https://learn.microsoft.com/en-us/virtualization/windowscontainers/manage-containers/hyperv-container).
>
>**Sadly, the truth is that Windows Containers** [never caught on in a major way](https://www.theregister.com/2021/07/06/microsoft_cancels_sql_server_beta_windows_server_containers/),
>and after years of watching teams trying to create and manage them, I see
>the trend of teams just moving their apps to support Linux, rather than
>continuing to fight with the poor support of Windows Containers. Microsoft
>even built a Windows-based MSSQL image, but [has since discontinued](https://www.theregister.com/2021/07/06/microsoft_cancels_sql_server_beta_windows_server_containers/) 
>it in 2021 in favor of their [Linux-based MSSQL image](https://hub.docker.com/r/microsoft/mssql-server).
>
>For those reasons, and seeing the challenges my consulting teams have in
>supporting Windows Containers over the years, **I still can't recommend Windows Containers in most cases**. 
>**The .NET teams I know are moving their codebase to .NET 5 on Linux, and adopting Linux containers**. If this changes in the future, I will update this lecture with current recommendations.


### Use MariaDB rather than MySQL

>In the next lecture, we'll spin up a MySQL container, but the 
>[official MySQL image](https://hub.docker.com/_/mysql) has now removed 
>commands like `ps` and `apt-get`.
>
>MySQL has multiple variants, though, that we can use (spin-off projects that
>are MySQL compatible).
>
>[MariaDB](https://hub.docker.com/_/mariadb) is a great alternative and even 
>supports MySQL-specific environment variables.
>
>So, just change the `mysql` image name in commands to `mariadb` and everything
>should work in this course!


### Package Management Essentials: apt, yum, dnf, pkg

[https://www.digitalocean.com/community/tutorials/package-management-basics-apt-yum-dnf-pkg]


### Format command and log output

[https://docs.docker.com/engine/cli/formatting/]


### FIXME: Change In Official Nginx Image Removes Ping 

>Hey just a quick note before doing the next few lectures. 
>A change in the official nginx image [https://hub.docker.com/_/nginx] 
>(`nginx`  or `nginx:latest` ) removes ping, but I use it in the next few videos to test connectivity, 
>so you might get an error about "ping not found". For now until I replace those videos, just do this:
>
>Anywhere I do a `docker container run <stuff> nginx` , where `nginx`  is the
>image you should use, replace that with `nginx:alpine` , which still has ping
>command in it.
>
>There are other ways to solve this, including adding the ping util with
>apt-get, making your own image, etc. More info [in this Q&A answer](https://www.udemy.com/course/docker-mastery/learn/lecture/7465418#questions/2487292).


### Overview of DNS

[https://docs.oracle.com/en-us/iaas/Content/DNS/Concepts/dnszonemanagement.htm]


### How DNS Works (in a comic, fun!)

[https://howdns.works/]


### Changes To Upcoming Assignment

>In the next video, you'll get a fun assignment
>on learning how Docker networks handle DNS and load balancing.
>
>There have been a few changes to the images and commands in that assignment,
>**so once you've watched the assignment**, you can come back here for updated
>instructions.
>
>
>#### Changes
>
>1. Elasticsearch newer versions **require environment variable changes to work correctly**. 
>Older elasticsearch versions still work, but don't support Arm64
>(Apple Silicon, etc). I provide a simpler alternative below that provides
>the same learning and testing w/o all the complexity of elasticsearch.
>
>2. `centos` **is no longer a supported image by Red Hat**, so we can use
>`rockylinux/rockylinux:10` as a drop-in replacement for centos.
>
>
>**There are two easier options for doing the next Assignment in 2025**
>
>Option 1:
>Use an updated Elasticsearch image and limit its Java memory: 
>
>**NOTE: This no longer works on Play-With-Docker due to memory limits. If using PWD, use Option 2.**
>
>Use a more updated version of elasticsearch, but you'll have to set memory
>requirements and change some default environment variables to make it work as
>a simple single container. Remember, you'll also want to change the network
>and alias for this assignment, but you can add the -e options similar to this:
>`docker run -e "discovery.type=single-node" -e "ES_JAVA_OPTS=-Xms512m -Xmx512m" -e "xpack.security.enabled=false" --network <your_network> -d --network-alias search elasticsearch:8.4.3`
>
>Then you could start another container to run nslookup and curl. Here's the
>full answer:
>
>##### create the bridge network 
>docker network create dude-net 
>##### create multiple containers on the same network with the same DNS alias 
>docker run -e "discovery.type=single-node" -e "ES_JAVA_OPTS=-Xms512m -Xmx512m"
>-e "xpack.security.enabled=false" --network dude-net -d --network-alias
>search elasticsearch:8.18.2 
>docker run -e "discovery.type=single-node" -e "ES_JAVA_OPTS=-Xms512m -Xmx512m" -e "xpack.security.enabled=false" --network dude-net -d --network-alias search elasticsearch:8.18.2 
>##### use alpine, which has nslookup built-in and you can use apk to add curl 
>docker run --rm -it --network dude-net alpine 
>##### use nslookup to see both container IPs for the same DNS name nslookup search # install curl and run it 2-5 times to see different cluster_uuid for each container 
># this shows that in the background, docker is delivering both IPs for the DNS name 
># and that curl is rotating between them in round-robin style 
>apk add curl 
>curl -s search:9200 
>curl -s search:9200 
>
>You'll notice the new elasticsearch no longer has random
>`cluster_name`, so you'll need to look at `cluster_uuid` to tell them apart.
>
>#### Option 2: Replace Elasticsearch with httpenv, a simple HTTP server: 
>
>You can replace the elasticsearch image name with the much simpler `bretfisher/httpenv`
>(which runs on port 8888, not 9200) and get the same effect in this
>assignment. It's just a simple web server that returns the environment
>variables (including the container hostnames, which are their Docker ID's,
>to tell them apart) in HTTP.
>
>##### create the bridge network 
>docker network create dude-net 
>##### create multiple containers on the same network with the same DNS alias 
>docker container run -d --network dude-net --net-alias search bretfisher/httpenv 
>docker container run -d --network dude-net --net-alias search bretfisher/httpenv 
>docker container run -d --network dude-net --net-alias search bretfisher/httpenv 
># Curl the DNS alias, notice the different HOSTNAMES in the response from httpenv (it returns the container ID as a env var) 
>docker container run --rm --network dude-net rockylinux/rockylinux:10 curl -s search:8888 
>docker container run --rm --network dude-net rockylinux/rockylinux:10 curl -s search:8888
>docker container run --rm --network dude-net rockylinux/rockylinux:10 curl -s search:8888 
>
>#### More Info on elasticsearch changes 
>
>The *only* reason I used elasticsearch in this demo was because 1. it uses HTTP, which we can easily
>curl for a response, and 2. Because each elasticsearch instance has a random
>ID, we can see that in a HTTP response to prove that multiple curl commands
>cause Docker to round-robin those connections to different containers.
>
>I was using the older `:2` tag for elasticsearch because newer versions use
>up *a lot* of memory and require complex environment variables to tune it
>for a typical laptop or Play With Docker.
>
>However, the `:2` tag for elasticsearch is old and only works on x86_64
>machines. The older v2  doesn't have an arm64 build (M1, M2, Apple Silicon,
>Raspberry Pi, etc.) It's one of the last lectures for me to replace with an
>image that has an arm64 variant as well as the typical x86_64, so if you're on
>a arm64 machine, you can use one of these two options to finish the assignment:


### Round-robin DNS

[https://en.wikipedia.org/wiki/Round-robin_DNS]


## 5 - Container Images, Where to Find Them and How to Build Them


### Docker Image Specification

[https://github.com/moby/docker-image-spec]


### List of Official Docker Images

[https://github.com/docker-library/official-images/tree/master/library]


### Docs: Image storage, drivers and layers

[https://docs.docker.com/engine/storage/drivers/]


### Dockerfile Command Details

#### (Bookmark and Review, lots of good details you'll use often when making Dockerfiles)

[https://docs.docker.com/reference/dockerfile/]


### Using Prune to Keep Your Docker System Clean (YouTube)


>You can use "prune" commands to clean up images, volumes, build cache, and containers. 
>Examples include:
>
>- `docker image prune` to clean up just "dangling" images
>
>- `docker system prune` will clean up everything you're not currently using
>
>- The big one is usually `docker image prune -a` which will remove all images
>you're not using. Use `docker system df` to see space usage.
>
>Remember each one of those commands has options you can learn with `--help`.
>
>Here's a YouTube video I made about it: [https://youtu.be/_4QzP7uwtvI]
>
>Lastly, realize that the Linux VM will *eventually* auto-shrink. You may
>not see the free space on your host OS right away, and it may take Docker
>a restart and some idle time before it completes a VM shrink.


## 6 -  Persistent Data: Volumes, Volumes, Volumes XD


### An introduction to immutable infrastructure

[https://www.oreilly.com/radar/an-introduction-to-immutable-infrastructure/]


### The 12-Factor App
#### (Everyone Should Read: Key to Cloud Native App Design, Deployment and Operation)

[https://12factor.net/]


### 12 Fractured Apps
#### (A Follow up to 12-Factor, a great article on how to do 12-Factor correctly in containers)

[https://medium.com/@kelseyhightower/12-fractured-apps-1080c73d481c#.cjvkgw4b3]


### Docker Storage Introduction in Docker Docs

[https://docs.docker.com/engine/storage/]


### Jekyll - A Static Site Generator
#### (Transform your plain text into static websites and blogs.)
#### (Just as background info, no need to install)

[https://jekyllrb.com/]


### Shell Differences for Path Expansion

>In the next lecture, you'll learn how to share files and directories between a host 
>and a Docker container. One of the parts of the command line you'll need to type is 
>the host file path you want to share.
>
>With Docker CLI, you can always use a full file path on any OS, but often
>you'll see me and others use a "parameter expansion" like `$(pwd)` which means
>"print working directory".
>
>**Here's the important part. Each shell may do this differently**, so here's a
>cheat sheet for which OS and Shell your using. I'll be using $(pwd) on a Mac,
>**but yours may be different!**
>
>This isn't a Docker thing, it's a Shell thing.
>
>For PowerShell use: `${pwd}`
>
>For cmd.exe "Command Prompt use: `%cd%`
>
>Linux/macOS bash, sh, zsh, and Windows Docker Toolbox Quickstart Terminal
>use: `$(pwd)`
>
>Note, if you have spaces in your path, you'll usually need to quote the
>whole path in the docker command.


### Database Passwords in Containers 

>We all know databases usually need passwords,
>but since the dawn of Docker, the postgres image (and a few others like
>redis) has allowed you to do a simple docker run on it and it starts without
>a password. Sure you could set a password but it didn't require one.
>
>**In Feburary 2020** [that changed](https://github.com/docker-library/postgres/issues/681), 
>and will affect using postgres in this course (and my others).
>**When running postgres now, you'll need to either set a password, or tell it to allow any connection** 
>(which was the default before this change).
>
>For `docker run`, and the forthcoming Docker Compose sections, you need to
>either set a password with the environment variable:
>
>`POSTGRES_PASSWORD=mypasswd`
>
>Or tell it to ignore passwords with the environment variable:
>
>`POSTGRES_HOST_AUTH_METHOD=trust`
>
>Note this change was in the Docker Hub image, and not a change in postgres
>itself.
>
>Also note if I or you were pinning versions, as we should, this wouldn't
>have surprised us. I tend to only pin to the minor version **in this course**
>(9.6) rather than the patch version (9.6.16) to keep you a bit more secure
>in the course. In the real world, I always pin my production apps to the
>patch version. It's the only safe way to operate. By pinning to the minor
>version in the courses, I prevent any major changes from breaking the
>course (in theory ha ha), yet also ensure you're running the latest patches
>(which would fix any bugs or security problems). In this, *very rare case*,
>the maintainer of the official postgres decided to introduce a breaking
>change in the *image* to a patch release of the app. The two aren't related,
>and it kinda shows off a weakness of the Docker Hub model... that there is
>no version of the Docker Hub image really, it's just tracking the upstream
>postgres versions... so then if any Docker Hub change would break something,
>it can't easily be tracked as a separate version from the app itself. Oh well,
>just remember to always pin the whole image version for things you care about.
>
>**I've updated the course repo files to indicate this change, but if you've cloned the repo before February 18th, 2020, you will need to update or replace your clone.**


### Updated Postgres Version for Next Video Assignment 

>In the next video, you'll do an assignment to illustrate how easy it is to swap out one Docker
>image for another connected to the same volume. Since the video's release,
>Postgres has had new versions, so I thought I'd let you know you can do the
>same assignment with recent versions of Postgres. These newer versions also
>work on arm64 and Apple Silicon machines.
>
>So, when you see the "old" and "new" versions of the Postgres SQL image in
>the Assignment video, you can replace them with these versions:
>
>`postgres:15.1`
>
>`postgres:15.2`


### Assignment Answers: Update for Recent Postgres Changes


>In the next video, you'll see me walk through this short assignment. Two things have changed
>since that video was released:
>
>1. Postgres requires a password to start
>
>2. Postgres needs a newer version to support arm64 and Apple Silicon
>
>So, if you did this assignment today on newer versions, this is what the
>commands could look like:
>
>`docker volume create psql docker run -d --name psql1 -e POSTGRES_PASSWORD=mypassword -v psql:/var/lib/postgresql/data postgres:15.1`
>`docker logs psql1 docker stop psql1 docker run -d --name psql2 -e POSTGRES_PASSWORD=mypassword -v psql:/var/lib/postgresql/data postgres:15.2`
>`docker logs psql2 docker stop psql2`


### File Permissions Across Multiple Containers


At some point you'll have file permissions problems with container apps not having 
the permissions they need. Maybe you want multiple containers to access the same volume(s). 
Or maybe you're bind-mounting existing files into a container.

Note that the below info is about pure Linux hosts, like production server
setups. If you're using Docker Desktop locally, it will translate permissions
from your host (macOS & Windows) into the container (Linux) automatically, but
when working on pure Linux servers with just `dockerd`, no translation is made.

#### How file permissions work across multiple containers accessing the same volume or bind-mount 

**File ownership between containers and the host are just numbers. **
They stay consistent no matter how you run them. Sometimes you see
friendly user names in commands like `ls` but those are just name-to-number
aliases that you'll see in `/etc/passwd` and `/etc/group`. Your host has
those files, and usually, your containers will have their own. They are
usually different. These files are really just for humans to see friendly
names. The Linux Kernel only cares about IDs, which are attached to each
file and directory in the file system itself, and those IDs are the same no
matter which process accesses them.

When a container is just accessing its own files, this isn't usually an issue.

**But for multiple containers accessing the same volume or bind-mount, problems can arise in two ways:**

**1. Problem one: The `/etc/passwd` is different across containers.** Creating
a named user in one container and running as that user may use ID 700,
but that same name in another container with a different `/etc/passwd`
may use a different ID for that same username. That's why I only care about
IDs when trying to sync up permissions. You'll see this confusion if you're
running a container on a Linux VM and it had a volume or bind-mount. If you
do an `ls` on those files from the host, it may show them owned by ubuntu
or node or systemd, etc. Then if you run `ls` inside the container, it may
show a different friendly username. The IDs are the same in both cases,
but the host will have a different `passwd` file than the container, and show
you different friendly names. **Different names are fine, because it's only ID that counts. Two processes trying to access the same file must have a matching user ID or group ID.**

**2. Problem two: Your two containers are running as different users**. Maybe the
user/group IDs and/or the USER statement in your Dockerfiles are different,
and the two containers are technically running under different IDs. Different
apps will end up running as different IDs. For example, the node base image
creates a [user called node with ID of 1000](https://github.com/nodejs/docker-node/blob/6256caf2c507e7aafdeb8e7f837bab51f46f99e0/17/bullseye/Dockerfile#L3-L4), 
but the NGINX image creates an [nginx user as ID 101](https://github.com/nginx/docker-nginx/blob/6f0396c1e06837672698bc97865ffcea9dc841d5/mainline/debian/Dockerfile#L16-L17). Also, some apps spin-off sub-processes as different users. NGINX starts its main process (PID 1) as root (ID 0) but spawns
sub-processes as the nginx user (ID 101), which keeps it more secure.

#### So for troubleshooting, this is what I do:

>1. Use the command `ps aux` in each
>container to see a list of processes and usernames. The process needs a
>matching user ID or group ID to access the files in question.
>
>2. Find the UID/GID in each containers `/etc/passwd` and `/etc/group` to
>translate names to numbers. You'll likely find there a miss-match, where
>one containers process originally wrote the files with its UID/GID and the
>other containers process is running as a different UID/GID.
>
>3. Figure out a way to ensure both containers are running with either a matching
>user ID or group ID. This is often easier to manage in your own custom app
>(when using a language base image like python or node) rather than trying to
>change a 3rd party app's container (like nginx or postgres)... but it all
>depends. This may mean creating a new user in one Dockerfile and setting
>the startup user with USER. ([see USER docs](https://docs.docker.com/reference/dockerfile/#user)) 
>The [node default image](https://github.com/nodejs/docker-node/blob/6256caf2c507e7aafdeb8e7f837bab51f46f99e0/17/bullseye/Dockerfile#L3-L4) has a good example of the commands for creating a user and group with hard-coded IDs:
>
>`RUN groupadd --gid 1000 node && useradd --uid 1000 --gid node --shell /bin/bash --create-home node     USER 1000:1000`
>
>**Note**: When setting a Dockerfile's USER, use numbers, which
>work better in Kubernetes than using names.
>
>**Note 2**: If `ps` doesn't work in your container, you may need to install it. In
>debian-based images with apt, you can add it with `apt-get update && apt-get install procps`


### Docs: Dockerfile reference

[https://docs.docker.com/reference/dockerfile/]


### Docs: ENTRYPOINT

[https://docs.docker.com/reference/dockerfile/#entrypoint]


### MySQL Docker Hub Image

[https://hub.docker.com/_/mysql]


### SIGINT, SIGTERM and SIGKILL

[https://eitca.org/cybersecurity/eitc-is-lsa-linux-system-administration/linux-processes/process-signals/examination-review-process-signals/explain-the-difference-between-sigint-sigterm-and-sigkill-signals-in-linux/]


### Docker Blog: Choosing Between RUN, CMD and ENTRYPOINT

[https://www.docker.com/blog/docker-best-practices-choosing-between-run-cmd-and-entrypoint/]


### PIDs in Linux and Unix

[https://en.wikipedia.org/wiki/Process_identifier]


### Docs: Shell and Exec Form

[https://docs.docker.com/reference/dockerfile/#shell-and-exec-form]


### Docs: How CMD and ENTRYPOINT interact

[https://docs.docker.com/reference/dockerfile/#understand-how-cmd-and-entrypoint-interact]


### Docs: The SHELL Statement

[https://docs.docker.com/reference/dockerfile/#shell]


### Docs: ENTRYPOINT Examples

[https://docs.docker.com/reference/dockerfile/#entrypoint]


### Constructing commands to run in Docker containers

[https://dev.to/rimelek/constructing-commands-to-run-in-docker-containers-2g2i]


### Assignment 1 instructions: Create CLI Utilities

[https://github.com/BretFisher/udemy-docker-mastery/tree/main/dockerfiles/entrypoint/assignment01]


### Assignment 1 Answer: Create CLI Utilities

[https://github.com/BretFisher/udemy-docker-mastery/tree/main/dockerfiles/entrypoint/assignment01]


### Assignment 2 Instructions: Startup Scripts

[https://github.com/BretFisher/udemy-docker-mastery/tree/main/dockerfiles/entrypoint/assignment02]


### Assignment 2 Answer: Startup Scripts

[https://github.com/BretFisher/udemy-docker-mastery/tree/main/dockerfiles/entrypoint/assignment02]