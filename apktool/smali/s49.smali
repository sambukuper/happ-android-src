.class public final synthetic Ls49;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La59;


# direct methods
.method public synthetic constructor <init>(La59;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, Ls49;->a:B

    .line 2
    .line 3
    iput-object p1, p0, Ls49;->b:La59;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 5

    .line 1
    iget-byte v0, p0, Ls49;->a:B

    .line 2
    .line 3
    sget-object v1, Lu39;->X:Lu39;

    .line 4
    .line 5
    iget-object p0, p0, Ls49;->b:La59;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    iget-object v0, p0, La59;->i:Ln49;

    .line 11
    .line 12
    iget-object p0, p0, La59;->c:Ljava/lang/String;

    .line 13
    .line 14
    invoke-virtual {v0, p0}, Ln49;->b(Ljava/lang/String;)Lu39;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    const/4 v3, 0x0

    .line 19
    if-ne v2, v1, :cond_0

    .line 20
    .line 21
    sget-object v1, Lu39;->Y:Lu39;

    .line 22
    .line 23
    invoke-virtual {v0, v1, p0}, Ln49;->h(Lu39;Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    iget-object v1, v0, Ln49;->a:Lql6;

    .line 27
    .line 28
    new-instance v2, Lnm7;

    .line 29
    .line 30
    const/16 v4, 0x11

    .line 31
    .line 32
    invoke-direct {v2, p0, v4}, Lnm7;-><init>(Ljava/lang/String;B)V

    .line 33
    .line 34
    .line 35
    const/4 v4, 0x1

    .line 36
    invoke-static {v1, v3, v4, v2}, Lu15;->G(Lql6;ZZLgn2;)Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    check-cast v1, Ljava/lang/Number;

    .line 41
    .line 42
    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    .line 43
    .line 44
    .line 45
    const/16 v1, -0x100

    .line 46
    .line 47
    invoke-virtual {v0, v1, p0}, Ln49;->i(ILjava/lang/String;)V

    .line 48
    .line 49
    .line 50
    move v3, v4

    .line 51
    :cond_0
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 52
    .line 53
    .line 54
    move-result-object p0

    .line 55
    return-object p0

    .line 56
    :pswitch_0
    iget-object p0, p0, La59;->a:Ll49;

    .line 57
    .line 58
    iget-object v0, p0, Ll49;->b:Lu39;

    .line 59
    .line 60
    if-eq v0, v1, :cond_1

    .line 61
    .line 62
    sget p0, Lb59;->a:I

    .line 63
    .line 64
    invoke-static {}, Llh4;->P0()Llh4;

    .line 65
    .line 66
    .line 67
    move-result-object p0

    .line 68
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 69
    .line 70
    .line 71
    sget-object p0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 72
    .line 73
    goto :goto_0

    .line 74
    :cond_1
    invoke-virtual {p0}, Ll49;->c()Z

    .line 75
    .line 76
    .line 77
    move-result v0

    .line 78
    if-nez v0, :cond_2

    .line 79
    .line 80
    iget-object v0, p0, Ll49;->b:Lu39;

    .line 81
    .line 82
    if-ne v0, v1, :cond_3

    .line 83
    .line 84
    iget v0, p0, Ll49;->k:I

    .line 85
    .line 86
    if-lez v0, :cond_3

    .line 87
    .line 88
    :cond_2
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 89
    .line 90
    .line 91
    move-result-wide v0

    .line 92
    invoke-virtual {p0}, Ll49;->a()J

    .line 93
    .line 94
    .line 95
    move-result-wide v2

    .line 96
    cmp-long p0, v0, v2

    .line 97
    .line 98
    if-gez p0, :cond_3

    .line 99
    .line 100
    invoke-static {}, Llh4;->P0()Llh4;

    .line 101
    .line 102
    .line 103
    move-result-object p0

    .line 104
    sget v0, Lb59;->a:I

    .line 105
    .line 106
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 107
    .line 108
    .line 109
    sget-object p0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 110
    .line 111
    goto :goto_0

    .line 112
    :cond_3
    sget-object p0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 113
    .line 114
    :goto_0
    return-object p0

    .line 115
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
