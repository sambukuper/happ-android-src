.class public final enum Ldp3;
.super Ljava/lang/Enum;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# static fields
.field public static final enum X:Ldp3;

.field public static final enum Y:Ldp3;

.field public static final enum Z:Ldp3;

.field public static final enum f0:Ldp3;

.field public static final enum g0:Ldp3;

.field public static final synthetic h0:[Ldp3;


# direct methods
.method static constructor <clinit>()V
    .locals 9

    .line 1
    new-instance v0, Ldp3;

    .line 2
    .line 3
    const-string v1, "ALWAYS"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v0, v1, v2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 7
    .line 8
    .line 9
    sput-object v0, Ldp3;->X:Ldp3;

    .line 10
    .line 11
    new-instance v1, Ldp3;

    .line 12
    .line 13
    const-string v2, "NON_NULL"

    .line 14
    .line 15
    const/4 v3, 0x1

    .line 16
    invoke-direct {v1, v2, v3}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 17
    .line 18
    .line 19
    sput-object v1, Ldp3;->Y:Ldp3;

    .line 20
    .line 21
    new-instance v2, Ldp3;

    .line 22
    .line 23
    const-string v3, "NON_ABSENT"

    .line 24
    .line 25
    const/4 v4, 0x2

    .line 26
    invoke-direct {v2, v3, v4}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 27
    .line 28
    .line 29
    new-instance v3, Ldp3;

    .line 30
    .line 31
    const-string v4, "NON_EMPTY"

    .line 32
    .line 33
    const/4 v5, 0x3

    .line 34
    invoke-direct {v3, v4, v5}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 35
    .line 36
    .line 37
    sput-object v3, Ldp3;->Z:Ldp3;

    .line 38
    .line 39
    new-instance v4, Ldp3;

    .line 40
    .line 41
    const-string v5, "NON_DEFAULT"

    .line 42
    .line 43
    const/4 v6, 0x4

    .line 44
    invoke-direct {v4, v5, v6}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 45
    .line 46
    .line 47
    sput-object v4, Ldp3;->f0:Ldp3;

    .line 48
    .line 49
    new-instance v5, Ldp3;

    .line 50
    .line 51
    const-string v6, "CUSTOM"

    .line 52
    .line 53
    const/4 v7, 0x5

    .line 54
    invoke-direct {v5, v6, v7}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 55
    .line 56
    .line 57
    new-instance v6, Ldp3;

    .line 58
    .line 59
    const-string v7, "USE_DEFAULTS"

    .line 60
    .line 61
    const/4 v8, 0x6

    .line 62
    invoke-direct {v6, v7, v8}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 63
    .line 64
    .line 65
    sput-object v6, Ldp3;->g0:Ldp3;

    .line 66
    .line 67
    filled-new-array/range {v0 .. v6}, [Ldp3;

    .line 68
    .line 69
    .line 70
    move-result-object v0

    .line 71
    sput-object v0, Ldp3;->h0:[Ldp3;

    .line 72
    .line 73
    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Ldp3;
    .locals 1

    .line 1
    const-class v0, Ldp3;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Ldp3;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[Ldp3;
    .locals 1

    .line 1
    sget-object v0, Ldp3;->h0:[Ldp3;

    .line 2
    .line 3
    invoke-virtual {v0}, [Ldp3;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [Ldp3;

    .line 8
    .line 9
    return-object v0
.end method
