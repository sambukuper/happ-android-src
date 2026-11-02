.class public final enum Lmr2;
.super Ljava/lang/Enum;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# static fields
.field public static final enum Y:Lmr2;

.field public static final enum Z:Lmr2;

.field public static final synthetic f0:[Lmr2;

.field public static final synthetic g0:Ln22;


# instance fields
.field public final X:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    new-instance v0, Lmr2;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const-string v2, "geosite.dat"

    .line 5
    .line 6
    const-string v3, "GEOSITE"

    .line 7
    .line 8
    invoke-direct {v0, v3, v1, v2}, Lmr2;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 9
    .line 10
    .line 11
    sput-object v0, Lmr2;->Y:Lmr2;

    .line 12
    .line 13
    new-instance v1, Lmr2;

    .line 14
    .line 15
    const/4 v2, 0x1

    .line 16
    const-string v3, "geoip.dat"

    .line 17
    .line 18
    const-string v4, "GEOIP"

    .line 19
    .line 20
    invoke-direct {v1, v4, v2, v3}, Lmr2;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 21
    .line 22
    .line 23
    sput-object v1, Lmr2;->Z:Lmr2;

    .line 24
    .line 25
    filled-new-array {v0, v1}, [Lmr2;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    sput-object v0, Lmr2;->f0:[Lmr2;

    .line 30
    .line 31
    new-instance v1, Ln22;

    .line 32
    .line 33
    invoke-direct {v1, v0}, Ln22;-><init>([Ljava/lang/Enum;)V

    .line 34
    .line 35
    .line 36
    sput-object v1, Lmr2;->g0:Ln22;

    .line 37
    .line 38
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;ILjava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    .line 3
    .line 4
    iput-object p3, p0, Lmr2;->X:Ljava/lang/String;

    .line 5
    .line 6
    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lmr2;
    .locals 1

    .line 1
    const-class v0, Lmr2;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lmr2;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[Lmr2;
    .locals 1

    .line 1
    sget-object v0, Lmr2;->f0:[Lmr2;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [Lmr2;

    .line 8
    .line 9
    return-object v0
.end method
