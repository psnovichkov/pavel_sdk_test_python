/*
A KBase module: pavel_sdk_test_python
This sample module contains one small method - count_contigs.
*/

module pavel_sdk_test_python {
	/*
	A string representing a ContigSet id.
	*/
	typedef string contigset_id;
	
	/*
	A string representing a workspace name.
	*/
	typedef string workspace_name;
	
	typedef structure {
	    int contig_count;
	} CountContigsResults;
	
	typedef structure{
	    string person_name;
	    string person_url;
	} Person;

	/*
	Count contigs in a ContigSet
	contigset_id - the ContigSet to count.
	*/
	funcdef count_contigs(workspace_name,contigset_id) returns (CountContigsResults) authentication required;

	funcdef get_person(string) returns (Person) authentication required;


};