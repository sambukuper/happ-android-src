.class public final enum Lgs3;
.super Ljava/lang/Enum;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lij3;


# static fields
.field public static final enum Y:Lgs3;

.field public static final synthetic Z:[Lgs3;


# instance fields
.field public final X:Lqo3;


# direct methods
.method static constructor <clinit>()V
    .locals 11

    .line 1
    new-instance v0, Lgs3;

    .line 2
    .line 3
    sget-object v1, Lqo3;->j0:Lqo3;

    .line 4
    .line 5
    const-string v2, "ESCAPE_NON_ASCII"

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    invoke-direct {v0, v2, v3, v3, v1}, Lgs3;-><init>(Ljava/lang/String;IZLqo3;)V

    .line 9
    .line 10
    .line 11
    new-instance v1, Lgs3;

    .line 12
    .line 13
    sget-object v2, Lqo3;->h0:Lqo3;

    .line 14
    .line 15
    const-string v4, "QUOTE_FIELD_NAMES"

    .line 16
    .line 17
    const/4 v5, 0x1

    .line 18
    invoke-direct {v1, v4, v5, v5, v2}, Lgs3;-><init>(Ljava/lang/String;IZLqo3;)V

    .line 19
    .line 20
    .line 21
    new-instance v2, Lgs3;

    .line 22
    .line 23
    const/4 v4, 0x2

    .line 24
    sget-object v6, Lqo3;->o0:Lqo3;

    .line 25
    .line 26
    const-string v7, "WRITE_HEX_UPPER_CASE"

    .line 27
    .line 28
    invoke-direct {v2, v7, v4, v5, v6}, Lgs3;-><init>(Ljava/lang/String;IZLqo3;)V

    .line 29
    .line 30
    .line 31
    move v4, v3

    .line 32
    new-instance v3, Lgs3;

    .line 33
    .line 34
    const/4 v6, 0x3

    .line 35
    sget-object v7, Lqo3;->i0:Lqo3;

    .line 36
    .line 37
    const-string v8, "WRITE_NAN_AS_STRINGS"

    .line 38
    .line 39
    invoke-direct {v3, v8, v6, v5, v7}, Lgs3;-><init>(Ljava/lang/String;IZLqo3;)V

    .line 40
    .line 41
    .line 42
    move v5, v4

    .line 43
    new-instance v4, Lgs3;

    .line 44
    .line 45
    const/4 v6, 0x4

    .line 46
    sget-object v7, Lqo3;->k0:Lqo3;

    .line 47
    .line 48
    const-string v8, "WRITE_NUMBERS_AS_STRINGS"

    .line 49
    .line 50
    invoke-direct {v4, v8, v6, v5, v7}, Lgs3;-><init>(Ljava/lang/String;IZLqo3;)V

    .line 51
    .line 52
    .line 53
    move v6, v5

    .line 54
    new-instance v5, Lgs3;

    .line 55
    .line 56
    const/4 v7, 0x5

    .line 57
    sget-object v8, Lqo3;->p0:Lqo3;

    .line 58
    .line 59
    const-string v9, "ESCAPE_FORWARD_SLASHES"

    .line 60
    .line 61
    invoke-direct {v5, v9, v7, v6, v8}, Lgs3;-><init>(Ljava/lang/String;IZLqo3;)V

    .line 62
    .line 63
    .line 64
    sput-object v5, Lgs3;->Y:Lgs3;

    .line 65
    .line 66
    move v7, v6

    .line 67
    new-instance v6, Lgs3;

    .line 68
    .line 69
    const/4 v8, 0x6

    .line 70
    sget-object v9, Lqo3;->q0:Lqo3;

    .line 71
    .line 72
    const-string v10, "COMBINE_UNICODE_SURROGATES_IN_UTF8"

    .line 73
    .line 74
    invoke-direct {v6, v10, v8, v7, v9}, Lgs3;-><init>(Ljava/lang/String;IZLqo3;)V

    .line 75
    .line 76
    .line 77
    filled-new-array/range {v0 .. v6}, [Lgs3;

    .line 78
    .line 79
    .line 80
    move-result-object v0

    .line 81
    sput-object v0, Lgs3;->Z:[Lgs3;

    .line 82
    .line 83
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;IZLqo3;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    .line 5
    .line 6
    .line 7
    iput-object p4, p0, Lgs3;->X:Lqo3;

    .line 8
    .line 9
    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lgs3;
    .locals 1

    .line 1
    const-class v0, Lgs3;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lgs3;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[Lgs3;
    .locals 1

    .line 1
    sget-object v0, Lgs3;->Z:[Lgs3;

    .line 2
    .line 3
    invoke-virtual {v0}, [Lgs3;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [Lgs3;

    .line 8
    .line 9
    return-object v0
.end method
