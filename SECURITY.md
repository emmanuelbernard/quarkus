# Security Policy

The Quarkus team and community take all security bugs very seriously.
You can find our guidelines here regarding our policy and security disclosure.

## Supported Versions

The community will fix security bugs for the latest major.minor version published at <https://quarkus.io/get-started/>.

| Version | Supported          |
| ------- | ------------------ |
| latest 1.x   | :white_check_mark: |
| older 1.x | :x:                |
| < 1.0 | :x:                |

We may fix the vulnerability to older versions depending on the severity of the issue and the age of the release, but we are only committing to the latest version released.

## Reporting a Vulnerability

Please report potential issues and vulnerabilities you found in Quarkus with details (e.g. steps to reproduce) to:

    secalert@redhat.com

The detailed instructions are available Red Hat's [Security Contacts and Procedures page](https://access.redhat.com/security/team/contact/).
This page details:

- GPG key
- how notifications are responded to
- update timing
- and more

### Ecosystem

Quarkus is an ecosystem made from many libraries like Eclipse Vert.x, Hibernate, Apache Camel and more.
If you find a security bug possibly rooted in of of these libraries, you can either disclose to them directly or disclose to the Quarkus team (following this process) and we will responsibly disclose the issue to the respective library.

### Why follow this process

Due to the sensitive nature of security bugs, the disclosure process is more constrained than a regular bug.
We appreciate you following these industry accepted guidelines, which gives time for a proper fix and limit the time window of attack.

### Why the Red Hat Product Security team?

Handling security vulnerability properly requires expertise.
The Red Hat security team is a trusted member if the security community.
A significant portion of the Quarkus team works for Red Hat.
We felt that leaving the process to an expert team was preferable to handling it on our own.
