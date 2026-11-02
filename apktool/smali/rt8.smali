.class public final enum Lrt8;
.super Ljava/lang/Enum;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# static fields
.field public static final enum Z:Lrt8;

.field public static final enum f0:Lrt8;

.field public static final enum g0:Lrt8;

.field public static final synthetic h0:[Lrt8;


# instance fields
.field public final X:Ljava/lang/String;

.field public final Y:Z


# direct methods
.method static constructor <clinit>()V
    .locals 7

    .line 1
    new-instance v0, Lrt8;

    .line 2
    .line 3
    const-string v1, "INVARIANT"

    .line 4
    .line 5
    const-string v2, ""

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    const/4 v4, 0x1

    .line 9
    invoke-direct {v0, v1, v2, v3, v4}, Lrt8;-><init>(Ljava/lang/String;Ljava/lang/String;IZ)V

    .line 10
    .line 11
    .line 12
    sput-object v0, Lrt8;->Z:Lrt8;

    .line 13
    .line 14
    new-instance v1, Lrt8;

    .line 15
    .line 16
    const-string v2, "IN_VARIANCE"

    .line 17
    .line 18
    const-string v5, "in"

    .line 19
    .line 20
    invoke-direct {v1, v2, v5, v4, v3}, Lrt8;-><init>(Ljava/lang/String;Ljava/lang/String;IZ)V

    .line 21
    .line 22
    .line 23
    sput-object v1, Lrt8;->f0:Lrt8;

    .line 24
    .line 25
    new-instance v2, Lrt8;

    .line 26
    .line 27
    const/4 v3, 0x2

    .line 28
    const-string v5, "out"

    .line 29
    .line 30
    const-string v6, "OUT_VARIANCE"

    .line 31
    .line 32
    invoke-direct {v2, v6, v5, v3, v4}, Lrt8;-><init>(Ljava/lang/String;Ljava/lang/String;IZ)V

    .line 33
    .line 34
    .line 35
    sput-object v2, Lrt8;->g0:Lrt8;

    .line 36
    .line 37
    filled-new-array {v0, v1, v2}, [Lrt8;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    sput-object v0, Lrt8;->h0:[Lrt8;

    .line 42
    .line 43
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;IZ)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p3}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    .line 3
    .line 4
    iput-object p2, p0, Lrt8;->X:Ljava/lang/String;

    .line 5
    .line 6
    iput-boolean p4, p0, Lrt8;->Y:Z

    .line 7
    .line 8
    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lrt8;
    .locals 1

    .line 1
    const-class v0, Lrt8;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lrt8;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[Lrt8;
    .locals 1

    .line 1
    sget-object v0, Lrt8;->h0:[Lrt8;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [Lrt8;

    .line 8
    .line 9
    return-object v0
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lrt8;->X:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method
