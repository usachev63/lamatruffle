TESTS=$(sort $(basename $(wildcard *.lama)))

LAMAC=../src/lamac

.PHONY: check $(TESTS)

check: $(TESTS)

$(TESTS): %: %.lama
	@echo $@
	LAMA=../runtime $(LAMAC)  $< && `which time` -f "$@\t%U" ./$@
	time ../standalone/target/slnative $<

clean:
	$(RM) test*.log *.s *~ $(TESTS) *.i
