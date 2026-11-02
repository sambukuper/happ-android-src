.class public abstract La79;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# static fields
.field public static final a:Lhq2;

.field public static final b:Ldo8;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    new-instance v0, Lhq2;

    .line 2
    .line 3
    new-instance v1, Lbx5;

    .line 4
    .line 5
    sget-object v2, Lz69;->X:Lz69;

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
    const/16 v2, 0xe

    .line 15
    .line 16
    const/4 v3, 0x0

    .line 17
    invoke-direct {v0, v1, v3, v2}, Lhq2;-><init>(Lbx5;Lcd1;I)V

    .line 18
    .line 19
    .line 20
    sput-object v0, La79;->a:Lhq2;

    .line 21
    .line 22
    new-instance v0, Ldo8;

    .line 23
    .line 24
    new-instance v1, Lbx5;

    .line 25
    .line 26
    sget-object v2, Ly69;->X:Ly69;

    .line 27
    .line 28
    invoke-virtual {v2}, Lnd0;->getName()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v4

    .line 32
    invoke-direct {v1, v2, v4}, Lbx5;-><init>(Lyv3;Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    const/16 v2, 0xc

    .line 36
    .line 37
    const/16 v4, 0x38

    .line 38
    .line 39
    invoke-direct {v0, v1, v2, v3, v4}, Ldo8;-><init>(Lbx5;ILe95;I)V

    .line 40
    .line 41
    .line 42
    sput-object v0, La79;->b:Ldo8;

    .line 43
    .line 44
    return-void
.end method
