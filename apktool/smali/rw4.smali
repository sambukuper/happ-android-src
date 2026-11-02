.class public final synthetic Lrw4;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Ldn2;


# instance fields
.field public final synthetic X:B

.field public final synthetic Y:Lo87;

.field public final synthetic Z:Ldn2;

.field public final synthetic f0:Lb71;


# direct methods
.method public synthetic constructor <init>(Lo87;Lb71;Ldn2;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-byte v0, p0, Lrw4;->X:B

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lrw4;->Y:Lo87;

    .line 8
    .line 9
    iput-object p2, p0, Lrw4;->f0:Lb71;

    .line 10
    .line 11
    iput-object p3, p0, Lrw4;->Z:Ldn2;

    .line 12
    .line 13
    return-void
.end method

.method public synthetic constructor <init>(Lo87;Ldn2;Lb71;)V
    .locals 1

    .line 14
    const/4 v0, 0x1

    iput-byte v0, p0, Lrw4;->X:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lrw4;->Y:Lo87;

    iput-object p2, p0, Lrw4;->Z:Ldn2;

    iput-object p3, p0, Lrw4;->f0:Lb71;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 7

    .line 1
    iget-byte v0, p0, Lrw4;->X:B

    .line 2
    .line 3
    sget-object v1, Ldn8;->a:Ldn8;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    iget-object v3, p0, Lrw4;->f0:Lb71;

    .line 7
    .line 8
    iget-object v4, p0, Lrw4;->Z:Ldn2;

    .line 9
    .line 10
    iget-object p0, p0, Lrw4;->Y:Lo87;

    .line 11
    .line 12
    const/4 v5, 0x3

    .line 13
    packed-switch v0, :pswitch_data_0

    .line 14
    .line 15
    .line 16
    iget-object v0, p0, Lo87;->d:Lt5;

    .line 17
    .line 18
    iget-object v0, v0, Lt5;->i0:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast v0, Lrh5;

    .line 21
    .line 22
    invoke-virtual {v0}, Lrh5;->getValue()Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    check-cast v0, Lp87;

    .line 27
    .line 28
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    const/4 v6, 0x1

    .line 33
    if-eq v0, v6, :cond_1

    .line 34
    .line 35
    const/4 v4, 0x2

    .line 36
    if-eq v0, v4, :cond_0

    .line 37
    .line 38
    new-instance v0, Luw4;

    .line 39
    .line 40
    const/4 v4, 0x5

    .line 41
    invoke-direct {v0, p0, v2, v4}, Luw4;-><init>(Lo87;Lq51;B)V

    .line 42
    .line 43
    .line 44
    invoke-static {v3, v2, v2, v0, v5}, Lw51;->G(Lb71;Ls61;Le71;Lrn2;I)Log7;

    .line 45
    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_0
    new-instance v0, Luw4;

    .line 49
    .line 50
    const/4 v4, 0x4

    .line 51
    invoke-direct {v0, p0, v2, v4}, Luw4;-><init>(Lo87;Lq51;B)V

    .line 52
    .line 53
    .line 54
    invoke-static {v3, v2, v2, v0, v5}, Lw51;->G(Lb71;Ls61;Le71;Lrn2;I)Log7;

    .line 55
    .line 56
    .line 57
    goto :goto_0

    .line 58
    :cond_1
    invoke-interface {v4}, Ldn2;->invoke()Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    :goto_0
    return-object v1

    .line 62
    :pswitch_0
    iget-object v0, p0, Lo87;->d:Lt5;

    .line 63
    .line 64
    iget-object v0, v0, Lt5;->f0:Ljava/lang/Object;

    .line 65
    .line 66
    check-cast v0, Lgn2;

    .line 67
    .line 68
    sget-object v6, Lp87;->X:Lp87;

    .line 69
    .line 70
    invoke-interface {v0, v6}, Lgn2;->B(Ljava/lang/Object;)Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object v0

    .line 74
    check-cast v0, Ljava/lang/Boolean;

    .line 75
    .line 76
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 77
    .line 78
    .line 79
    move-result v0

    .line 80
    if-eqz v0, :cond_2

    .line 81
    .line 82
    new-instance v0, Luw4;

    .line 83
    .line 84
    invoke-direct {v0, p0, v2, v5}, Luw4;-><init>(Lo87;Lq51;B)V

    .line 85
    .line 86
    .line 87
    invoke-static {v3, v2, v2, v0, v5}, Lw51;->G(Lb71;Ls61;Le71;Lrn2;I)Log7;

    .line 88
    .line 89
    .line 90
    move-result-object v0

    .line 91
    new-instance v2, Ltw4;

    .line 92
    .line 93
    const/4 v3, 0x0

    .line 94
    invoke-direct {v2, p0, v4, v3}, Ltw4;-><init>(Lo87;Ldn2;B)V

    .line 95
    .line 96
    .line 97
    invoke-virtual {v0, v2}, Lrm3;->D(Lgn2;)Lgq1;

    .line 98
    .line 99
    .line 100
    :cond_2
    return-object v1

    .line 101
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
