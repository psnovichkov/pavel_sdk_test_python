use strict;
use Data::Dumper;
use Bio::KBase::pavel_sdk_test_python::Client;


my $user = $ENV{'KB_TEST_USER_NAME'};
my $password = $ENV{'TEST_PSWD'};

# Initialize the client
# note: if you are logged in using kbase-login, then you don't need to set user name and password here
my $module = new Bio::KBase::pavel_sdk_test_python::Client("http://localhost:5000",user_id=>$user, password=>$password);

# standard rpc call
print "Calling RPC \$module->count_contigs(..)\n";
my $result = $module->count_contigs("contigset_12345");
print "returned: \n  ".Dumper($result);