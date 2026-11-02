.class public abstract Lja8;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# static fields
.field public static final a:Ldo8;

.field public static final b:Ldo8;

.field public static final c:Ldo8;

.field public static final d:Lhq2;


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
    sget-object v2, Lfa8;->X:Lfa8;

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
    const/16 v2, 0x17

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
    sput-object v0, Lja8;->a:Ldo8;

    .line 23
    .line 24
    new-instance v0, Ldo8;

    .line 25
    .line 26
    new-instance v1, Lbx5;

    .line 27
    .line 28
    sget-object v2, Lha8;->X:Lha8;

    .line 29
    .line 30
    invoke-virtual {v2}, Lnd0;->getName()Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v5

    .line 34
    invoke-direct {v1, v2, v5}, Lbx5;-><init>(Lyv3;Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    const/16 v2, 0x3b

    .line 38
    .line 39
    invoke-direct {v0, v1, v2, v3, v4}, Ldo8;-><init>(Lbx5;ILe95;I)V

    .line 40
    .line 41
    .line 42
    sput-object v0, Lja8;->b:Ldo8;

    .line 43
    .line 44
    new-instance v0, Ldo8;

    .line 45
    .line 46
    new-instance v1, Lbx5;

    .line 47
    .line 48
    sget-object v4, Lia8;->X:Lia8;

    .line 49
    .line 50
    invoke-virtual {v4}, Lnd0;->getName()Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object v5

    .line 54
    invoke-direct {v1, v4, v5}, Lbx5;-><init>(Lyv3;Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    const/16 v4, 0x28

    .line 58
    .line 59
    invoke-direct {v0, v1, v2, v3, v4}, Ldo8;-><init>(Lbx5;ILe95;I)V

    .line 60
    .line 61
    .line 62
    sput-object v0, Lja8;->c:Ldo8;

    .line 63
    .line 64
    new-instance v0, Lhq2;

    .line 65
    .line 66
    new-instance v1, Lbx5;

    .line 67
    .line 68
    sget-object v2, Lea8;->X:Lea8;

    .line 69
    .line 70
    const-string v3, "nanosecond"

    .line 71
    .line 72
    invoke-direct {v1, v2, v3}, Lbx5;-><init>(Lyv3;Ljava/lang/String;)V

    .line 73
    .line 74
    .line 75
    new-instance v2, Lcd1;

    .line 76
    .line 77
    const/16 v3, 0x9

    .line 78
    .line 79
    const/4 v4, 0x0

    .line 80
    invoke-direct {v2, v4, v3}, Lcd1;-><init>(II)V

    .line 81
    .line 82
    .line 83
    const/16 v3, 0xa

    .line 84
    .line 85
    invoke-direct {v0, v1, v2, v3}, Lhq2;-><init>(Lbx5;Lcd1;I)V

    .line 86
    .line 87
    .line 88
    sput-object v0, Lja8;->d:Lhq2;

    .line 89
    .line 90
    sget-object v0, Lda8;->X:Lda8;

    .line 91
    .line 92
    invoke-virtual {v0}, Lnd0;->getName()Ljava/lang/String;

    .line 93
    .line 94
    .line 95
    move-result-object v0

    .line 96
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 97
    .line 98
    .line 99
    sget-object v0, Lga8;->X:Lga8;

    .line 100
    .line 101
    invoke-virtual {v0}, Lnd0;->getName()Ljava/lang/String;

    .line 102
    .line 103
    .line 104
    move-result-object v0

    .line 105
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 106
    .line 107
    .line 108
    return-void
.end method
