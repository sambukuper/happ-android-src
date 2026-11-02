.class public final enum Lvn5;
.super Ljava/lang/Enum;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# static fields
.field public static final X:Lwe5;

.field public static final enum Y:Lvn5;

.field public static final enum Z:Lvn5;

.field public static final synthetic f0:[Lvn5;

.field public static final synthetic g0:Ln22;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, Lvn5;

    .line 2
    .line 3
    const-string v1, "TIME"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v0, v1, v2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 7
    .line 8
    .line 9
    sput-object v0, Lvn5;->Y:Lvn5;

    .line 10
    .line 11
    new-instance v1, Lvn5;

    .line 12
    .line 13
    const-string v2, "ICON"

    .line 14
    .line 15
    const/4 v3, 0x1

    .line 16
    invoke-direct {v1, v2, v3}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 17
    .line 18
    .line 19
    sput-object v1, Lvn5;->Z:Lvn5;

    .line 20
    .line 21
    filled-new-array {v0, v1}, [Lvn5;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    sput-object v0, Lvn5;->f0:[Lvn5;

    .line 26
    .line 27
    new-instance v1, Ln22;

    .line 28
    .line 29
    invoke-direct {v1, v0}, Ln22;-><init>([Ljava/lang/Enum;)V

    .line 30
    .line 31
    .line 32
    sput-object v1, Lvn5;->g0:Ln22;

    .line 33
    .line 34
    new-instance v0, Lwe5;

    .line 35
    .line 36
    const/4 v1, 0x3

    .line 37
    invoke-direct {v0, v1}, Lwe5;-><init>(B)V

    .line 38
    .line 39
    .line 40
    sput-object v0, Lvn5;->X:Lwe5;

    .line 41
    .line 42
    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lvn5;
    .locals 1

    .line 1
    const-class v0, Lvn5;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lvn5;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[Lvn5;
    .locals 1

    .line 1
    sget-object v0, Lvn5;->f0:[Lvn5;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [Lvn5;

    .line 8
    .line 9
    return-object v0
.end method
