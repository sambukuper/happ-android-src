.class public final enum Ldu5;
.super Ljava/lang/Enum;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# static fields
.field public static final g0:Ljava/util/Set;

.field public static final enum h0:Ldu5;

.field public static final enum i0:Ldu5;

.field public static final enum j0:Ldu5;

.field public static final enum k0:Ldu5;

.field public static final enum l0:Ldu5;

.field public static final enum m0:Ldu5;

.field public static final enum n0:Ldu5;

.field public static final enum o0:Ldu5;

.field public static final synthetic p0:[Ldu5;


# instance fields
.field public final X:Lv15;

.field public final Y:Lv15;

.field public final Z:Lg44;

.field public final f0:Lg44;


# direct methods
.method static constructor <clinit>()V
    .locals 11

    .line 1
    new-instance v0, Ldu5;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const-string v2, "Boolean"

    .line 5
    .line 6
    const-string v3, "BOOLEAN"

    .line 7
    .line 8
    invoke-direct {v0, v3, v1, v2}, Ldu5;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 9
    .line 10
    .line 11
    sput-object v0, Ldu5;->h0:Ldu5;

    .line 12
    .line 13
    new-instance v1, Ldu5;

    .line 14
    .line 15
    const/4 v2, 0x1

    .line 16
    const-string v3, "Char"

    .line 17
    .line 18
    const-string v4, "CHAR"

    .line 19
    .line 20
    invoke-direct {v1, v4, v2, v3}, Ldu5;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 21
    .line 22
    .line 23
    sput-object v1, Ldu5;->i0:Ldu5;

    .line 24
    .line 25
    new-instance v2, Ldu5;

    .line 26
    .line 27
    const/4 v3, 0x2

    .line 28
    const-string v4, "Byte"

    .line 29
    .line 30
    const-string v5, "BYTE"

    .line 31
    .line 32
    invoke-direct {v2, v5, v3, v4}, Ldu5;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 33
    .line 34
    .line 35
    sput-object v2, Ldu5;->j0:Ldu5;

    .line 36
    .line 37
    new-instance v3, Ldu5;

    .line 38
    .line 39
    const/4 v4, 0x3

    .line 40
    const-string v5, "Short"

    .line 41
    .line 42
    const-string v6, "SHORT"

    .line 43
    .line 44
    invoke-direct {v3, v6, v4, v5}, Ldu5;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 45
    .line 46
    .line 47
    sput-object v3, Ldu5;->k0:Ldu5;

    .line 48
    .line 49
    new-instance v4, Ldu5;

    .line 50
    .line 51
    const/4 v5, 0x4

    .line 52
    const-string v6, "Int"

    .line 53
    .line 54
    const-string v7, "INT"

    .line 55
    .line 56
    invoke-direct {v4, v7, v5, v6}, Ldu5;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 57
    .line 58
    .line 59
    sput-object v4, Ldu5;->l0:Ldu5;

    .line 60
    .line 61
    new-instance v5, Ldu5;

    .line 62
    .line 63
    const/4 v6, 0x5

    .line 64
    const-string v7, "Float"

    .line 65
    .line 66
    const-string v8, "FLOAT"

    .line 67
    .line 68
    invoke-direct {v5, v8, v6, v7}, Ldu5;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 69
    .line 70
    .line 71
    sput-object v5, Ldu5;->m0:Ldu5;

    .line 72
    .line 73
    new-instance v6, Ldu5;

    .line 74
    .line 75
    const/4 v7, 0x6

    .line 76
    const-string v8, "Long"

    .line 77
    .line 78
    const-string v9, "LONG"

    .line 79
    .line 80
    invoke-direct {v6, v9, v7, v8}, Ldu5;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 81
    .line 82
    .line 83
    sput-object v6, Ldu5;->n0:Ldu5;

    .line 84
    .line 85
    new-instance v7, Ldu5;

    .line 86
    .line 87
    const/4 v8, 0x7

    .line 88
    const-string v9, "Double"

    .line 89
    .line 90
    const-string v10, "DOUBLE"

    .line 91
    .line 92
    invoke-direct {v7, v10, v8, v9}, Ldu5;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 93
    .line 94
    .line 95
    sput-object v7, Ldu5;->o0:Ldu5;

    .line 96
    .line 97
    filled-new-array/range {v0 .. v7}, [Ldu5;

    .line 98
    .line 99
    .line 100
    move-result-object v0

    .line 101
    sput-object v0, Ldu5;->p0:[Ldu5;

    .line 102
    .line 103
    move-object v8, v5

    .line 104
    move-object v9, v6

    .line 105
    move-object v10, v7

    .line 106
    move-object v5, v2

    .line 107
    move-object v6, v3

    .line 108
    move-object v7, v4

    .line 109
    move-object v4, v1

    .line 110
    filled-new-array/range {v4 .. v10}, [Ldu5;

    .line 111
    .line 112
    .line 113
    move-result-object v0

    .line 114
    invoke-static {v0}, Leu;->L0([Ljava/lang/Object;)Ljava/util/Set;

    .line 115
    .line 116
    .line 117
    move-result-object v0

    .line 118
    sput-object v0, Ldu5;->g0:Ljava/util/Set;

    .line 119
    .line 120
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;ILjava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    .line 3
    .line 4
    invoke-static {p3}, Lv15;->e(Ljava/lang/String;)Lv15;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    iput-object p1, p0, Ldu5;->X:Lv15;

    .line 9
    .line 10
    const-string p1, "Array"

    .line 11
    .line 12
    invoke-virtual {p3, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    invoke-static {p1}, Lv15;->e(Ljava/lang/String;)Lv15;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    iput-object p1, p0, Ldu5;->Y:Lv15;

    .line 21
    .line 22
    new-instance p1, Lcu5;

    .line 23
    .line 24
    const/4 p2, 0x0

    .line 25
    invoke-direct {p1, p0, p2}, Lcu5;-><init>(Ldu5;B)V

    .line 26
    .line 27
    .line 28
    sget-object p2, Lw74;->X:Lw74;

    .line 29
    .line 30
    invoke-static {p2, p1}, Lx97;->P(Lw74;Ldn2;)Lg44;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    iput-object p1, p0, Ldu5;->Z:Lg44;

    .line 35
    .line 36
    new-instance p1, Lcu5;

    .line 37
    .line 38
    const/4 p3, 0x1

    .line 39
    invoke-direct {p1, p0, p3}, Lcu5;-><init>(Ldu5;B)V

    .line 40
    .line 41
    .line 42
    invoke-static {p2, p1}, Lx97;->P(Lw74;Ldn2;)Lg44;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    iput-object p1, p0, Ldu5;->f0:Lg44;

    .line 47
    .line 48
    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Ldu5;
    .locals 1

    .line 1
    const-class v0, Ldu5;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Ldu5;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[Ldu5;
    .locals 1

    .line 1
    sget-object v0, Ldu5;->p0:[Ldu5;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [Ldu5;

    .line 8
    .line 9
    return-object v0
.end method
