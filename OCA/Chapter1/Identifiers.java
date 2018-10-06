class ValidIdentifiers {
	int a;
	int _; // compiler WARNING (not error)
	int $;
	int A;
	int _1234abd_$_;
}
class InvalidIdentifiers {
	int #;
	int 1a;
	int -a123;
	int &23_;
	int a#fds;
}
