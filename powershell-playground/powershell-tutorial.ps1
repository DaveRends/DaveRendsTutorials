# PowerShell training from https://www.spguides.com/powershell-examples/

# You may first need to update your execution policy, so that your powerShell instance can actually do stuff

# Check it - if restricted, update
Get-ExecutionPolicy

Set-ExecutionPolicy Unrestricted

# To check the latest version of PowerShell installed on the server, 
# Enter the command “$PSVersionTable”.

$PSVersionTable

# Get-Help is the net most important command to learn. You can call it on any CmdLet, adn get detail on how it works, required parameters and expected outputs.
# For example

Get-Help -Name Get-Process

# You may need to update your local help files

Update-Help

######################

# Working with folders

# Navigating directories
# Use ls to list the contents in the current directory
# Use cd to change directory, Ctrl + Space to intellisense from a list

# You can move up a level within the directory with this

cd ..\..\


# New-Item cmdlets are used to add a new folder in your System. Follow the command:

New-Item -Path 'C:\PowerShell learning\test-folder' -ItemType Directory

# Use Ctrl + Space to open intellisense - you can test it on the line above to see the other item types available.

# For example, you can then create an item of type 'File' with the extension .txt at the end of its name, to create a text file

# You can also do this in Google Drive etc. Whatever folder withing a drive you are in, you can switch drives with just cd 'D:', or cd 'D:'

ls

# Copy item is fairly simple - Copy-Item 'G:\padmini\SourceFolder' 'C:\DestinationFolder'
# Move-item, remove-item and rename-item are as expected

# You can see if a file/directory path exists, with a boolean response, like this
# PS C:\PowerShell learning> Test-Path '.\PowerShell tutorial2.ps1'


ls

## This doesn't seem to work yet 
# Get-Help Invoke-WebRequest -Uri 'https://www.confused.com'