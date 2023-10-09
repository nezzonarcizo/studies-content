### terminal path shorter
> PS1="${debian_chroot:+($debian_chroot)}\[\033[01;34m\]\W \[\033[32m\]\$\[\033[00m\] "


# Seção 1: Introduction - AWS Certified Solutions Architect Associate

- PLEASE READ: Lectures you can skip if you took a course from me before

## **== PLEASE READ THIS BRIEF NOTE ==**

**Welcome to the course!**

A] If you did not do any course on AWS before...

It is perfectly fine to start with this course if you're new with AWS.

Most learners start with this course on AWS Solutions Architect Associate, with some doing the AWS Certified Cloud Practitioner as a less technical warmup. If you feel overwhelmed by this course, try to watch the AWS Certified Cloud Practitioner course first.

After this course, most learners move on to AWS Certified Developer or AWS Certified SysOps Administrator. 


B] If you first completed my AWS Certified Cloud Practitioner course

You can skip sections 3, 4, 5 & 12


C] If you first completed my AWS Certified Developer Associate course and don't want to re-watch content...

Please watch the following lectures: 

Section 5 - EC2 Fundamentals

Spot Instances & Spot Fleet

EC2 Instances Launch Types Hands On

Section 6 - EC2 - Solutions Architect Associate Level

Private vs Public vs Elastic IP

Private vs Public vs Elastic IP Hands On

EC2 Placement Groups

EC2 Placement Groups - Hands On

Elastic Network Interfaces (ENI) - Overview

Elastic Network Interfaces (ENI) - Hands On

ENI - Extra Reading

EC2 Hibernate

EC2 Hibernate - Hands On

Section 7 - EC2 Instance Storage

EBS Encryption

Section 8 can be skipped

Section 9 - AWS Fundamentals: RDS + Aurora + ElastiCache

RDS Custom for Oracle and Microsoft SQL Server

Amazon Aurora - Advanced Concepts

RDS & Aurora - Backup and Monitoring

RDS Proxy

ElastiCache for Solution Architects

List of Ports to be familiar with

Section 11 - Classic Solutions Architecture Discussions

Solutions Architecture Discussions Overview

WhatsTheTime.com

MyClothes.com

MyWordPress.com

Instantiating applications quickly

Beanstalk Hands On

Section 14 - Advanced Amazon S3

S3 Requester Pays

S3 Batch Operations

Section 15 - Amazon S3 Security

Glacier Vault Lock & S3 Object Lock

Section 16 - CloudFront & AWS Global Accelerator

CloudFront - Price Classes

CloudFront - Cache Invalidation

AWS Global Accelerator - Overview

AWS Global Accelerator - Hands On

Section 17 - AWS Storage Extras

AWS Snow Family Overview

AWS Snow Family Hands On

Architecture: Snowball into Glacier

Amazon FSx

Amazon FSx - Hands On

Storage Gateway Overview

Storage Gateway Hands On

AWS Transfer Family

All AWS Storage Options Compared

Section 18 - Decoupling applications: SQS, SNS, Kinesis, Active MQ

SQS - Long Polling

SQS + Auto Scaling Group

Kinesis Data Analytics

Amazon MQ

And everything from section 19 onwards.

Happy learning!
Stephane Maarek


# Seção 2: Code & Slides Download

***Download***


# Seção 3: Getting started with AWS

* to see the AWS global infrastructure
https://infrastructure.aws


* to find out which services are available in a particular region
https://aws.amazon.com/pt/about-aws/global-infrastructure/regional-product-services/?p=ngi&loc=4&refid=0c2b5279-1e50-459b-b9b5-6b0861ac160e


*--- Page 19*

# Seção 4: IAM & AWS CLI

- AWS CloudShell: Region Availability

AWS CloudShell: Region Availability
In the next lecture, I demo AWS CloudShell.

It is not yet available in all regions, and you can find the region list here:
[CloudShell](https://docs.aws.amazon.com/cloudshell/latest/userguide/supported-aws-regions.html)

> Please switch to one of these regions if you want to do the next (optional) hands-on.


# Seção 5: EC2 Fundamentals