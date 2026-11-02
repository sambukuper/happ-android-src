.class public final synthetic Liv7;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lgn2;


# instance fields
.field public final synthetic X:B

.field public final synthetic Y:Ldw7;


# direct methods
.method public synthetic constructor <init>(Ldw7;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, Liv7;->X:B

    .line 2
    .line 3
    iput-object p1, p0, Liv7;->Y:Ldw7;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final B(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget-byte v0, p0, Liv7;->X:B

    .line 2
    .line 3
    const-string v1, "Required value was null."

    .line 4
    .line 5
    iget-object p0, p0, Liv7;->Y:Ldw7;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    check-cast p1, Ljava/lang/Integer;

    .line 9
    .line 10
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 11
    .line 12
    .line 13
    move-result p1

    .line 14
    packed-switch v0, :pswitch_data_0

    .line 15
    .line 16
    .line 17
    iget-object p0, p0, Leb4;->c:Liv;

    .line 18
    .line 19
    iget-object p0, p0, Liv;->f:Ljava/util/List;

    .line 20
    .line 21
    invoke-interface {p0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    instance-of p1, p0, Lov7;

    .line 26
    .line 27
    if-eqz p1, :cond_0

    .line 28
    .line 29
    check-cast p0, Lov7;

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_0
    move-object p0, v2

    .line 33
    :goto_0
    if-eqz p0, :cond_1

    .line 34
    .line 35
    move-object v2, p0

    .line 36
    goto :goto_1

    .line 37
    :cond_1
    invoke-static {v1}, Lbt;->q(Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    :goto_1
    return-object v2

    .line 41
    :pswitch_0
    iget-object p0, p0, Leb4;->c:Liv;

    .line 42
    .line 43
    iget-object p0, p0, Liv;->f:Ljava/util/List;

    .line 44
    .line 45
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 46
    .line 47
    .line 48
    add-int/lit8 p1, p1, 0x1

    .line 49
    .line 50
    invoke-static {p1, p0}, Lwv0;->u0(ILjava/util/List;)Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object p0

    .line 54
    instance-of p0, p0, Lqv7;

    .line 55
    .line 56
    xor-int/lit8 p0, p0, 0x1

    .line 57
    .line 58
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 59
    .line 60
    .line 61
    move-result-object p0

    .line 62
    return-object p0

    .line 63
    :pswitch_1
    invoke-virtual {p0, p1}, Ldw7;->l(I)Lpv7;

    .line 64
    .line 65
    .line 66
    move-result-object p0

    .line 67
    if-eqz p0, :cond_2

    .line 68
    .line 69
    move-object v2, p0

    .line 70
    goto :goto_2

    .line 71
    :cond_2
    invoke-static {v1}, Lbt;->q(Ljava/lang/String;)V

    .line 72
    .line 73
    .line 74
    :goto_2
    return-object v2

    .line 75
    :pswitch_2
    iget-object p0, p0, Leb4;->c:Liv;

    .line 76
    .line 77
    iget-object p0, p0, Liv;->f:Ljava/util/List;

    .line 78
    .line 79
    invoke-interface {p0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    move-result-object p0

    .line 83
    instance-of p1, p0, Lrv7;

    .line 84
    .line 85
    if-eqz p1, :cond_3

    .line 86
    .line 87
    check-cast p0, Lrv7;

    .line 88
    .line 89
    goto :goto_3

    .line 90
    :cond_3
    move-object p0, v2

    .line 91
    :goto_3
    if-eqz p0, :cond_4

    .line 92
    .line 93
    move-object v2, p0

    .line 94
    goto :goto_4

    .line 95
    :cond_4
    invoke-static {v1}, Lbt;->q(Ljava/lang/String;)V

    .line 96
    .line 97
    .line 98
    :goto_4
    return-object v2

    .line 99
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
