.class public abstract Lg95;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# static fields
.field public static final a:Ldo8;

.field public static final b:Ldo8;

.field public static final c:Ldo8;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .line 1
    new-instance v0, Le95;

    .line 2
    .line 3
    invoke-direct {v0}, Le95;-><init>()V

    .line 4
    .line 5
    .line 6
    new-instance v1, Lbx5;

    .line 7
    .line 8
    sget-object v2, Lf95;->X:Lf95;

    .line 9
    .line 10
    invoke-virtual {v2}, Lnd0;->getName()Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v3

    .line 14
    invoke-direct {v1, v2, v3}, Lbx5;-><init>(Lyv3;Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    new-instance v2, Ldo8;

    .line 18
    .line 19
    const/16 v3, 0x12

    .line 20
    .line 21
    const/16 v4, 0x8

    .line 22
    .line 23
    invoke-direct {v2, v1, v3, v0, v4}, Ldo8;-><init>(Lbx5;ILe95;I)V

    .line 24
    .line 25
    .line 26
    sput-object v2, Lg95;->a:Ldo8;

    .line 27
    .line 28
    new-instance v1, Lbx5;

    .line 29
    .line 30
    sget-object v2, Lb95;->X:Lb95;

    .line 31
    .line 32
    invoke-virtual {v2}, Lnd0;->getName()Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v3

    .line 36
    invoke-direct {v1, v2, v3}, Lbx5;-><init>(Lyv3;Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    new-instance v2, Ldo8;

    .line 40
    .line 41
    const/16 v3, 0x3b

    .line 42
    .line 43
    invoke-direct {v2, v1, v3, v0, v4}, Ldo8;-><init>(Lbx5;ILe95;I)V

    .line 44
    .line 45
    .line 46
    sput-object v2, Lg95;->b:Ldo8;

    .line 47
    .line 48
    new-instance v1, Lbx5;

    .line 49
    .line 50
    sget-object v2, Lc95;->X:Lc95;

    .line 51
    .line 52
    invoke-virtual {v2}, Lnd0;->getName()Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object v5

    .line 56
    invoke-direct {v1, v2, v5}, Lbx5;-><init>(Lyv3;Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    new-instance v2, Ldo8;

    .line 60
    .line 61
    invoke-direct {v2, v1, v3, v0, v4}, Ldo8;-><init>(Lbx5;ILe95;I)V

    .line 62
    .line 63
    .line 64
    sput-object v2, Lg95;->c:Ldo8;

    .line 65
    .line 66
    return-void
.end method
