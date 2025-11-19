ALTER TABLE "character"
    ADD CONSTRAINT "fkdfhdn54qtwbhljkvel8h6q8vf" FOREIGN KEY ("player_id") REFERENCES "player" ("id") ON UPDATE NO ACTION ON DELETE NO ACTION;