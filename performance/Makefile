TESTS=$(sort $(basename $(wildcard *.lama)))

LAMAC=lamac

.PHONY: check $(TESTS)

check: $(TESTS)

$(TESTS): %: %.lama
	@echo $@
	$(LAMAC)  $< && `which time` -f "$@\t%U" ./$@
	`which time` -f "$@\t%U" ../standalone/target/slnative $<

clean:
	$(RM) test*.log *.s *~ $(TESTS) *.i
