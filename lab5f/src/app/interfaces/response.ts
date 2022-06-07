import { Laptops } from "./laptops";

export interface Response {
    _embedded: {
        laptops: Laptops[]
    },
    _links: {
        self: {
            href: string;
        },
        profile: {
            href: string;
        }
    },
    page: {
        size: number;
        totalElements: number;
        totalPages: number;
        number: number;
    }
}
