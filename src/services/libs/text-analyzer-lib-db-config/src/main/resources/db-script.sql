CREATE DATABASE text_analyzer;

CREATE TABLE `text_analyzer`.`book` (
	`id` BIGINT NOT NULL AUTO_INCREMENT,
	`authorId` BIGINT NOT NULL,
	`genre` VARCHAR(255) NOT NULL,
	`path` VARCHAR(255) NOT NULL UNIQUE,
	`name` VARCHAR(255) NOT NULL UNIQUE,
	`writtenData` DATE NOT NULL,
	`chapters` BIGINT,
	`sentences` BIGINT,
	`words` BIGINT,
	`senseId` BIGINT,
	PRIMARY KEY (`id`)
);

CREATE TABLE `text_analyzer`.`wordsRepeated` (
	`wordId` BIGINT NOT NULL AUTO_INCREMENT,
	`bookId` BIGINT NOT NULL,
	`words` BIGINT NOT NULL,
	`repeatedTime` BIGINT NOT NULL,
	PRIMARY KEY (`wordId`)
);

CREATE TABLE `text_analyzer`.`words` (
	`id` BIGINT NOT NULL AUTO_INCREMENT,
	`name` VARCHAR(255) NOT NULL UNIQUE,
	`descriptionId` BIGINT NOT NULL,
	`morphemeId` BIGINT NOT NULL,
	`rootId` BIGINT NOT NULL,
	PRIMARY KEY (`id`,`name`)
);

CREATE TABLE `text_analyzer`.`author` (
	`id` BIGINT NOT NULL AUTO_INCREMENT,
	`name` VARCHAR(255) NOT NULL,
	`surname` VARCHAR(255) NOT NULL,
	`Patronymic` VARCHAR(255) NOT NULL,
	`born place` VARCHAR(255) NOT NULL,
	`born date` DATE NOT NULL,
	`death place` VARCHAR(255) NOT NULL,
	`death date` DATE NOT NULL,
	`writing style` VARCHAR(255) NOT NULL,
	`characteristic` VARCHAR(255) NOT NULL,
	`Literary movement` VARCHAR(255) NOT NULL,
	PRIMARY KEY (`id`)
);

CREATE TABLE `text_analyzer`.`wordDescription` (
	`id` BIGINT NOT NULL AUTO_INCREMENT,
	`Part of speech` VARCHAR(255) NOT NULL,
	`Sphere` VARCHAR(255) NOT NULL,
	PRIMARY KEY (`id`)
);

CREATE TABLE `text_analyzer`.`synonyms` (
	`wordId` BIGINT NOT NULL,
	`synonynId` BIGINT NOT NULL,
	PRIMARY KEY (`wordId`,`synonynId`)
);

CREATE TABLE `text_analyzer`.`morpheme` (
	`id` BIGINT NOT NULL AUTO_INCREMENT,
	`rootId` BIGINT NOT NULL,
	`prefix` VARCHAR(255) NOT NULL,
	`suffix` VARCHAR(255) NOT NULL,
	`postfix` VARCHAR(255),
    PRIMARY KEY (`id`)
);

CREATE TABLE `text_analyzer`.`bookSense` (
	`id` BIGINT NOT NULL AUTO_INCREMENT,
	`topicId` BIGINT NOT NULL,
    PRIMARY KEY (`id`)
);

CREATE TABLE `text_analyzer`.`heroes` (
	`id` BINARY NOT NULL,
	`name` VARCHAR(255) NOT NULL,
	`nickname` VARCHAR(255) NOT NULL,
	`Characteristics` VARCHAR(255) NOT NULL,
	`bookSenseId` BIGINT NOT NULL
);

CREATE TABLE `text_analyzer`.`topic` (
	`id` BIGINT NOT NULL AUTO_INCREMENT,
	`topicName` BIGINT NOT NULL,
    PRIMARY KEY (`id`)
);

CREATE TABLE `text_analyzer`.`root` (
	`id` BIGINT NOT NULL AUTO_INCREMENT,
	`root` VARCHAR(255) NOT NULL,
	PRIMARY KEY (`id`,`root`)
);

ALTER TABLE `text_analyzer`.`book` ADD CONSTRAINT `Book_fk0` FOREIGN KEY (`authorId`) REFERENCES `text_analyzer`.`author`(`id`);

ALTER TABLE `text_analyzer`.`book` ADD CONSTRAINT `Book_fk1` FOREIGN KEY (`senseId`) REFERENCES `text_analyzer`.`bookSense`(`id`);

ALTER TABLE `text_analyzer`.`wordsRepeated` ADD CONSTRAINT `wordsRepeated_fk0` FOREIGN KEY (`wordId`) REFERENCES `text_analyzer`.word(`id`);

ALTER TABLE `text_analyzer`.`wordsRepeated` ADD CONSTRAINT `wordsRepeated_fk1` FOREIGN KEY (`bookId`) REFERENCES `text_analyzer`.`book`(`id`);

ALTER TABLE `text_analyzer`.word ADD CONSTRAINT `Words_fk0` FOREIGN KEY (`descriptionId`) REFERENCES `text_analyzer`.description(`id`);

ALTER TABLE `text_analyzer`.word ADD CONSTRAINT `Words_fk1` FOREIGN KEY (`morphemeId`) REFERENCES `text_analyzer`.`morpheme`(`id`);

ALTER TABLE `text_analyzer`.word ADD CONSTRAINT `Words_fk2` FOREIGN KEY (`rootId`) REFERENCES `text_analyzer`.`root`(`id`);

ALTER TABLE `text_analyzer`.`synonyms` ADD CONSTRAINT `Synonyms_fk0` FOREIGN KEY (`wordId`) REFERENCES `text_analyzer`.word(`id`);

ALTER TABLE `text_analyzer`.`synonyms` ADD CONSTRAINT `Synonyms_fk1` FOREIGN KEY (`synonynId`) REFERENCES `text_analyzer`.word(`id`);

ALTER TABLE `text_analyzer`.`morpheme` ADD CONSTRAINT `Morpheme_fk0` FOREIGN KEY (`rootId`) REFERENCES `text_analyzer`.`root`(`id`);

ALTER TABLE `text_analyzer`.`bookSense` ADD CONSTRAINT `Book Sense_fk0` FOREIGN KEY (`topicId`) REFERENCES `text_analyzer`.`topic`(`id`);

ALTER TABLE `text_analyzer`.hero ADD CONSTRAINT `Heroes_fk0` FOREIGN KEY (`bookSenseId`) REFERENCES `text_analyzer`.`bookSense`(`topicId`);

