.class public final Lva5;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lo85;


# instance fields
.field public final synthetic X:B

.field public final Y:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, Lva5;->X:B

    .line 2
    .line 3
    iput-object p1, p0, Lva5;->Y:Ljava/lang/Object;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;)V
    .locals 3

    .line 1
    iget-byte v0, p0, Lva5;->X:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Laq7;

    .line 7
    .line 8
    iget-object p0, p0, Lva5;->Y:Ljava/lang/Object;

    .line 9
    .line 10
    sget-boolean v0, Low6;->Z:Z

    .line 11
    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    new-instance v0, Lka7;

    .line 15
    .line 16
    invoke-direct {v0, p1, p0}, Lka7;-><init>(Laq7;Ljava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lo8;

    .line 21
    .line 22
    const/16 v1, 0x9

    .line 23
    .line 24
    invoke-direct {v0, p1, p0, v1}, Lo8;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 25
    .line 26
    .line 27
    :goto_0
    invoke-virtual {p1, v0}, Laq7;->f(Liv5;)V

    .line 28
    .line 29
    .line 30
    return-void

    .line 31
    :pswitch_0
    check-cast p1, Laq7;

    .line 32
    .line 33
    :try_start_0
    iget-object p0, p0, Lva5;->Y:Ljava/lang/Object;

    .line 34
    .line 35
    check-cast p0, Ljava/util/ArrayList;

    .line 36
    .line 37
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 42
    .line 43
    .line 44
    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 45
    iget-object v1, p1, Laq7;->X:Lk01;

    .line 46
    .line 47
    iget-boolean v1, v1, Lk01;->Y:Z

    .line 48
    .line 49
    if-nez v1, :cond_2

    .line 50
    .line 51
    if-nez v0, :cond_1

    .line 52
    .line 53
    invoke-interface {p1}, Lu85;->b()V

    .line 54
    .line 55
    .line 56
    goto :goto_1

    .line 57
    :cond_1
    new-instance v0, Lxa5;

    .line 58
    .line 59
    invoke-direct {v0, p1, p0}, Lxa5;-><init>(Laq7;Ljava/util/Iterator;)V

    .line 60
    .line 61
    .line 62
    invoke-virtual {p1, v0}, Laq7;->f(Liv5;)V

    .line 63
    .line 64
    .line 65
    goto :goto_1

    .line 66
    :catchall_0
    move-exception p0

    .line 67
    invoke-static {p0, p1}, Lvr3;->d0(Ljava/lang/Throwable;Lu85;)V

    .line 68
    .line 69
    .line 70
    :cond_2
    :goto_1
    return-void

    .line 71
    :pswitch_1
    check-cast p1, Laq7;

    .line 72
    .line 73
    new-instance v0, Lwa5;

    .line 74
    .line 75
    iget-object p0, p0, Lva5;->Y:Ljava/lang/Object;

    .line 76
    .line 77
    check-cast p0, [Ljava/lang/Object;

    .line 78
    .line 79
    invoke-direct {v0, p1, p0}, Lwa5;-><init>(Laq7;[Ljava/lang/Object;)V

    .line 80
    .line 81
    .line 82
    invoke-virtual {p1, v0}, Laq7;->f(Liv5;)V

    .line 83
    .line 84
    .line 85
    return-void

    .line 86
    :pswitch_2
    check-cast p1, Laq7;

    .line 87
    .line 88
    new-instance v0, Lm5;

    .line 89
    .line 90
    invoke-direct {v0, p1}, Lm5;-><init>(Laq7;)V

    .line 91
    .line 92
    .line 93
    new-instance v1, Lua5;

    .line 94
    .line 95
    invoke-direct {v1, v0}, Lua5;-><init>(Lm5;)V

    .line 96
    .line 97
    .line 98
    iget-object v0, p1, Laq7;->X:Lk01;

    .line 99
    .line 100
    invoke-virtual {v0, v1}, Lk01;->b(Lcq7;)V

    .line 101
    .line 102
    .line 103
    iget-object v0, v1, Lua5;->m0:Lk37;

    .line 104
    .line 105
    iget-object v2, p1, Laq7;->X:Lk01;

    .line 106
    .line 107
    invoke-virtual {v2, v0}, Lk01;->b(Lcq7;)V

    .line 108
    .line 109
    .line 110
    new-instance v0, Lq02;

    .line 111
    .line 112
    const/16 v2, 0x1a

    .line 113
    .line 114
    invoke-direct {v0, v1, v2}, Lq02;-><init>(Ljava/lang/Object;B)V

    .line 115
    .line 116
    .line 117
    invoke-virtual {p1, v0}, Laq7;->f(Liv5;)V

    .line 118
    .line 119
    .line 120
    iget-object p1, p1, Laq7;->X:Lk01;

    .line 121
    .line 122
    iget-boolean p1, p1, Lk01;->Y:Z

    .line 123
    .line 124
    if-nez p1, :cond_3

    .line 125
    .line 126
    iget-object p0, p0, Lva5;->Y:Ljava/lang/Object;

    .line 127
    .line 128
    check-cast p0, Lq85;

    .line 129
    .line 130
    invoke-virtual {p0, v1}, Lq85;->d(Laq7;)V

    .line 131
    .line 132
    .line 133
    :cond_3
    return-void

    .line 134
    nop

    .line 135
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
