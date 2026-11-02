.class public final enum La04;
.super Ljava/lang/Enum;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# static fields
.field public static final Y:Lk32;

.field public static final Z:Ljava/util/LinkedHashMap;

.field public static final enum f0:La04;

.field public static final enum g0:La04;

.field public static final enum h0:La04;

.field public static final enum i0:La04;

.field public static final enum j0:La04;

.field public static final enum k0:La04;

.field public static final synthetic l0:[La04;


# instance fields
.field public final X:B


# direct methods
.method static constructor <clinit>()V
    .locals 9

    .line 1
    new-instance v0, La04;

    .line 2
    .line 3
    const-string v1, "UNKNOWN"

    .line 4
    .line 5
    const/4 v6, 0x0

    .line 6
    invoke-direct {v0, v1, v6, v6}, La04;-><init>(Ljava/lang/String;II)V

    .line 7
    .line 8
    .line 9
    sput-object v0, La04;->f0:La04;

    .line 10
    .line 11
    new-instance v1, La04;

    .line 12
    .line 13
    const-string v2, "CLASS"

    .line 14
    .line 15
    const/4 v3, 0x1

    .line 16
    invoke-direct {v1, v2, v3, v3}, La04;-><init>(Ljava/lang/String;II)V

    .line 17
    .line 18
    .line 19
    sput-object v1, La04;->g0:La04;

    .line 20
    .line 21
    new-instance v2, La04;

    .line 22
    .line 23
    const-string v3, "FILE_FACADE"

    .line 24
    .line 25
    const/4 v4, 0x2

    .line 26
    invoke-direct {v2, v3, v4, v4}, La04;-><init>(Ljava/lang/String;II)V

    .line 27
    .line 28
    .line 29
    sput-object v2, La04;->h0:La04;

    .line 30
    .line 31
    new-instance v3, La04;

    .line 32
    .line 33
    const-string v4, "SYNTHETIC_CLASS"

    .line 34
    .line 35
    const/4 v5, 0x3

    .line 36
    invoke-direct {v3, v4, v5, v5}, La04;-><init>(Ljava/lang/String;II)V

    .line 37
    .line 38
    .line 39
    sput-object v3, La04;->i0:La04;

    .line 40
    .line 41
    new-instance v4, La04;

    .line 42
    .line 43
    const-string v5, "MULTIFILE_CLASS"

    .line 44
    .line 45
    const/4 v7, 0x4

    .line 46
    invoke-direct {v4, v5, v7, v7}, La04;-><init>(Ljava/lang/String;II)V

    .line 47
    .line 48
    .line 49
    sput-object v4, La04;->j0:La04;

    .line 50
    .line 51
    new-instance v5, La04;

    .line 52
    .line 53
    const-string v7, "MULTIFILE_CLASS_PART"

    .line 54
    .line 55
    const/4 v8, 0x5

    .line 56
    invoke-direct {v5, v7, v8, v8}, La04;-><init>(Ljava/lang/String;II)V

    .line 57
    .line 58
    .line 59
    sput-object v5, La04;->k0:La04;

    .line 60
    .line 61
    filled-new-array/range {v0 .. v5}, [La04;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    sput-object v0, La04;->l0:[La04;

    .line 66
    .line 67
    new-instance v0, Lk32;

    .line 68
    .line 69
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 70
    .line 71
    .line 72
    sput-object v0, La04;->Y:Lk32;

    .line 73
    .line 74
    invoke-static {}, La04;->values()[La04;

    .line 75
    .line 76
    .line 77
    move-result-object v0

    .line 78
    array-length v1, v0

    .line 79
    invoke-static {v1}, Laq4;->G(I)I

    .line 80
    .line 81
    .line 82
    move-result v1

    .line 83
    const/16 v2, 0x10

    .line 84
    .line 85
    if-ge v1, v2, :cond_0

    .line 86
    .line 87
    move v1, v2

    .line 88
    :cond_0
    new-instance v2, Ljava/util/LinkedHashMap;

    .line 89
    .line 90
    invoke-direct {v2, v1}, Ljava/util/LinkedHashMap;-><init>(I)V

    .line 91
    .line 92
    .line 93
    array-length v1, v0

    .line 94
    :goto_0
    if-ge v6, v1, :cond_1

    .line 95
    .line 96
    aget-object v3, v0, v6

    .line 97
    .line 98
    iget-byte v4, v3, La04;->X:B

    .line 99
    .line 100
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 101
    .line 102
    .line 103
    move-result-object v4

    .line 104
    invoke-interface {v2, v4, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 105
    .line 106
    .line 107
    add-int/lit8 v6, v6, 0x1

    .line 108
    .line 109
    goto :goto_0

    .line 110
    :cond_1
    sput-object v2, La04;->Z:Ljava/util/LinkedHashMap;

    .line 111
    .line 112
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;II)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    .line 3
    .line 4
    iput-byte p3, p0, La04;->X:B

    .line 5
    .line 6
    return-void
.end method

.method public static valueOf(Ljava/lang/String;)La04;
    .locals 1

    .line 1
    const-class v0, La04;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, La04;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[La04;
    .locals 1

    .line 1
    sget-object v0, La04;->l0:[La04;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [La04;

    .line 8
    .line 9
    return-object v0
.end method
