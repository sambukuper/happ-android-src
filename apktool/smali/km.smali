.class public final enum Lkm;
.super Ljava/lang/Enum;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# static fields
.field public static final enum Y:Lkm;

.field public static final enum Z:Lkm;

.field public static final enum f0:Lkm;

.field public static final enum g0:Lkm;

.field public static final enum h0:Lkm;

.field public static final synthetic i0:[Lkm;


# instance fields
.field public final X:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 8

    .line 1
    new-instance v0, Lkm;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const-string v2, "METHOD"

    .line 5
    .line 6
    const-string v3, "METHOD_RETURN_TYPE"

    .line 7
    .line 8
    invoke-direct {v0, v3, v1, v2}, Lkm;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 9
    .line 10
    .line 11
    sput-object v0, Lkm;->Y:Lkm;

    .line 12
    .line 13
    new-instance v1, Lkm;

    .line 14
    .line 15
    const/4 v2, 0x1

    .line 16
    const-string v3, "PARAMETER"

    .line 17
    .line 18
    const-string v4, "VALUE_PARAMETER"

    .line 19
    .line 20
    invoke-direct {v1, v4, v2, v3}, Lkm;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 21
    .line 22
    .line 23
    sput-object v1, Lkm;->Z:Lkm;

    .line 24
    .line 25
    new-instance v2, Lkm;

    .line 26
    .line 27
    const-string v3, "FIELD"

    .line 28
    .line 29
    const/4 v4, 0x2

    .line 30
    invoke-direct {v2, v3, v4, v3}, Lkm;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 31
    .line 32
    .line 33
    sput-object v2, Lkm;->f0:Lkm;

    .line 34
    .line 35
    new-instance v3, Lkm;

    .line 36
    .line 37
    const/4 v4, 0x3

    .line 38
    const-string v5, "TYPE_USE"

    .line 39
    .line 40
    invoke-direct {v3, v5, v4, v5}, Lkm;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 41
    .line 42
    .line 43
    sput-object v3, Lkm;->g0:Lkm;

    .line 44
    .line 45
    new-instance v4, Lkm;

    .line 46
    .line 47
    const-string v6, "TYPE_PARAMETER_BOUNDS"

    .line 48
    .line 49
    const/4 v7, 0x4

    .line 50
    invoke-direct {v4, v6, v7, v5}, Lkm;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 51
    .line 52
    .line 53
    sput-object v4, Lkm;->h0:Lkm;

    .line 54
    .line 55
    new-instance v5, Lkm;

    .line 56
    .line 57
    const-string v6, "TYPE_PARAMETER"

    .line 58
    .line 59
    const/4 v7, 0x5

    .line 60
    invoke-direct {v5, v6, v7, v6}, Lkm;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 61
    .line 62
    .line 63
    filled-new-array/range {v0 .. v5}, [Lkm;

    .line 64
    .line 65
    .line 66
    move-result-object v0

    .line 67
    sput-object v0, Lkm;->i0:[Lkm;

    .line 68
    .line 69
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;ILjava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    .line 3
    .line 4
    iput-object p3, p0, Lkm;->X:Ljava/lang/String;

    .line 5
    .line 6
    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lkm;
    .locals 1

    .line 1
    const-class v0, Lkm;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lkm;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[Lkm;
    .locals 1

    .line 1
    sget-object v0, Lkm;->i0:[Lkm;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [Lkm;

    .line 8
    .line 9
    return-object v0
.end method
