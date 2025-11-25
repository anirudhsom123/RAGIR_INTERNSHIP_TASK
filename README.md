
---

## Code Highlights

- **Entity Class**: Represents organizations and contains fields like `id`, `organizerCode`, and `name`.
- **Repository Interface**: Uses Spring Data JPA with methods like `findByName` to retrieve organizations by their name.
- **Service Layer**: Generates the `organizerCode` dynamically after initial database save by prefixing "ORG" and formatting the auto-generated numeric ID with leading zeros.
- **Controller**: Exposes REST endpoints using Spring MVC to interact with organization data.

---

## How Organizer Code is Generated

The `organizerCode` is generated in the service layer by:

- Saving the entity first to obtain a numeric auto-generated ID.
- Formatting this ID with a prefix "ORG" and padding with zeros to make a 4-digit number.
- Setting `organizerCode` to this formatted value.
- Saving the entity again to persist the generated code.

Example Format: `ORG0001`, `ORG0035`, `ORG1240`.

---

## Contributing

Contributions are welcome! Feel free to fork the project, submit issues, or open pull requests for improvements.

---

## License

This project is licensed under the MIT License.

---

## Contact

- Developer: Anirudh Som  
- GitHub: [anirudhsom123](https://github.com/anirudhsom123)  
- Email: anirudhsom@example.com  

---

*Thank you for checking out this project!*

