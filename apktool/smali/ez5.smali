.class public final enum Lez5;
.super Ljava/lang/Enum;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lbg3;


# static fields
.field public static final enum Y:Lez5;

.field public static final enum Z:Lez5;

.field public static final enum f0:Lez5;

.field public static final synthetic g0:[Lez5;


# instance fields
.field public final X:B


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    new-instance v0, Lez5;

    .line 2
    .line 3
    const-string v1, "CLASS"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v0, v1, v2, v2}, Lez5;-><init>(Ljava/lang/String;II)V

    .line 7
    .line 8
    .line 9
    sput-object v0, Lez5;->Y:Lez5;

    .line 10
    .line 11
    new-instance v1, Lez5;

    .line 12
    .line 13
    const-string v2, "PACKAGE"

    .line 14
    .line 15
    const/4 v3, 0x1

    .line 16
    invoke-direct {v1, v2, v3, v3}, Lez5;-><init>(Ljava/lang/String;II)V

    .line 17
    .line 18
    .line 19
    sput-object v1, Lez5;->Z:Lez5;

    .line 20
    .line 21
    new-instance v2, Lez5;

    .line 22
    .line 23
    const-string v3, "LOCAL"

    .line 24
    .line 25
    const/4 v4, 0x2

    .line 26
    invoke-direct {v2, v3, v4, v4}, Lez5;-><init>(Ljava/lang/String;II)V

    .line 27
    .line 28
    .line 29
    sput-object v2, Lez5;->f0:Lez5;

    .line 30
    .line 31
    filled-new-array {v0, v1, v2}, [Lez5;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    sput-object v0, Lez5;->g0:[Lez5;

    .line 36
    .line 37
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;II)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    .line 3
    .line 4
    iput-byte p3, p0, Lez5;->X:B

    .line 5
    .line 6
    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lez5;
    .locals 1

    .line 1
    const-class v0, Lez5;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lez5;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[Lez5;
    .locals 1

    .line 1
    sget-object v0, Lez5;->g0:[Lez5;

    .line 2
    .line 3
    invoke-virtual {v0}, [Lez5;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [Lez5;

    .line 8
    .line 9
    return-object v0
.end method


# virtual methods
.method public final a()I
    .locals 0

    .line 1
    iget-byte p0, p0, Lez5;->X:B

    .line 2
    .line 3
    return p0
.end method
