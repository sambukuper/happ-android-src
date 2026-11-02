.class public final enum Lex4;
.super Ljava/lang/Enum;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# static fields
.field public static final enum Y:Lex4;

.field public static final enum Z:Lex4;

.field public static final enum f0:Lex4;

.field public static final enum g0:Lex4;

.field public static final synthetic h0:[Lex4;

.field public static final synthetic i0:Ln22;


# instance fields
.field public final X:Lid2;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .line 1
    new-instance v0, Lex4;

    .line 2
    .line 3
    const-string v1, "FINAL"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v0, v1, v2, v2}, Lex4;-><init>(Ljava/lang/String;II)V

    .line 7
    .line 8
    .line 9
    sput-object v0, Lex4;->Y:Lex4;

    .line 10
    .line 11
    new-instance v1, Lex4;

    .line 12
    .line 13
    const-string v2, "OPEN"

    .line 14
    .line 15
    const/4 v3, 0x1

    .line 16
    invoke-direct {v1, v2, v3, v3}, Lex4;-><init>(Ljava/lang/String;II)V

    .line 17
    .line 18
    .line 19
    sput-object v1, Lex4;->Z:Lex4;

    .line 20
    .line 21
    new-instance v2, Lex4;

    .line 22
    .line 23
    const-string v3, "ABSTRACT"

    .line 24
    .line 25
    const/4 v4, 0x2

    .line 26
    invoke-direct {v2, v3, v4, v4}, Lex4;-><init>(Ljava/lang/String;II)V

    .line 27
    .line 28
    .line 29
    sput-object v2, Lex4;->f0:Lex4;

    .line 30
    .line 31
    new-instance v3, Lex4;

    .line 32
    .line 33
    const-string v4, "SEALED"

    .line 34
    .line 35
    const/4 v5, 0x3

    .line 36
    invoke-direct {v3, v4, v5, v5}, Lex4;-><init>(Ljava/lang/String;II)V

    .line 37
    .line 38
    .line 39
    sput-object v3, Lex4;->g0:Lex4;

    .line 40
    .line 41
    filled-new-array {v0, v1, v2, v3}, [Lex4;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    sput-object v0, Lex4;->h0:[Lex4;

    .line 46
    .line 47
    new-instance v1, Ln22;

    .line 48
    .line 49
    invoke-direct {v1, v0}, Ln22;-><init>([Ljava/lang/Enum;)V

    .line 50
    .line 51
    .line 52
    sput-object v1, Lex4;->i0:Ln22;

    .line 53
    .line 54
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;II)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    .line 3
    .line 4
    new-instance p1, Lid2;

    .line 5
    .line 6
    sget-object p2, Lmd2;->e:Lkd2;

    .line 7
    .line 8
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    invoke-direct {p1, p2, p3}, Lid2;-><init>(Lld2;I)V

    .line 12
    .line 13
    .line 14
    iput-object p1, p0, Lex4;->X:Lid2;

    .line 15
    .line 16
    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lex4;
    .locals 1

    .line 1
    const-class v0, Lex4;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lex4;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[Lex4;
    .locals 1

    .line 1
    sget-object v0, Lex4;->h0:[Lex4;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [Lex4;

    .line 8
    .line 9
    return-object v0
.end method
