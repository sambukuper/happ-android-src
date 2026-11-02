.class public abstract Lvb1;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# static fields
.field public static final a:Ldo8;

.field public static final b:Ldo8;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .line 1
    new-instance v0, Ldo8;

    .line 2
    .line 3
    new-instance v1, Lbx5;

    .line 4
    .line 5
    sget-object v2, Lsb1;->X:Lsb1;

    .line 6
    .line 7
    invoke-virtual {v2}, Lnd0;->getName()Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v3

    .line 11
    invoke-direct {v1, v2, v3}, Lbx5;-><init>(Lyv3;Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    const/16 v2, 0x1f

    .line 15
    .line 16
    const/4 v3, 0x0

    .line 17
    const/16 v4, 0x38

    .line 18
    .line 19
    invoke-direct {v0, v1, v2, v3, v4}, Ldo8;-><init>(Lbx5;ILe95;I)V

    .line 20
    .line 21
    .line 22
    sput-object v0, Lvb1;->a:Ldo8;

    .line 23
    .line 24
    sget-object v0, Lub1;->X:Lub1;

    .line 25
    .line 26
    invoke-virtual {v0}, Lnd0;->getName()Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 31
    .line 32
    .line 33
    new-instance v0, Ldo8;

    .line 34
    .line 35
    new-instance v1, Lbx5;

    .line 36
    .line 37
    sget-object v2, Ltb1;->X:Ltb1;

    .line 38
    .line 39
    invoke-virtual {v2}, Lnd0;->getName()Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object v5

    .line 43
    invoke-direct {v1, v2, v5}, Lbx5;-><init>(Lyv3;Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    const/16 v2, 0x16e

    .line 47
    .line 48
    invoke-direct {v0, v1, v2, v3, v4}, Ldo8;-><init>(Lbx5;ILe95;I)V

    .line 49
    .line 50
    .line 51
    sput-object v0, Lvb1;->b:Ldo8;

    .line 52
    .line 53
    return-void
.end method
