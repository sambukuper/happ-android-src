.class public final synthetic Lt53;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Ld57;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, Lt53;->a:B

    .line 2
    .line 3
    iput-object p1, p0, Lt53;->b:Ljava/lang/Object;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final a(Lf57;)V
    .locals 3

    .line 1
    iget-byte v0, p0, Lt53;->a:B

    .line 2
    .line 3
    iget-object p0, p0, Lt53;->b:Ljava/lang/Object;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    check-cast p0, Le57;

    .line 9
    .line 10
    iget-object p0, p0, Le57;->n:Ljava/util/ArrayList;

    .line 11
    .line 12
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    if-eqz v0, :cond_0

    .line 21
    .line 22
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    check-cast v0, Ld57;

    .line 27
    .line 28
    invoke-interface {v0, p1}, Ld57;->a(Lf57;)V

    .line 29
    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_0
    return-void

    .line 33
    :pswitch_0
    check-cast p0, Llt5;

    .line 34
    .line 35
    invoke-virtual {p0}, Lhq8;->d()Lcj0;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    if-nez p1, :cond_1

    .line 40
    .line 41
    goto :goto_1

    .line 42
    :cond_1
    iget-object p1, p0, Lhq8;->h:Ler8;

    .line 43
    .line 44
    check-cast p1, Lmt5;

    .line 45
    .line 46
    iget-object v0, p0, Lhq8;->i:Liz;

    .line 47
    .line 48
    invoke-virtual {p0, p1, v0}, Llt5;->K(Lmt5;Liz;)V

    .line 49
    .line 50
    .line 51
    invoke-virtual {p0}, Lhq8;->r()V

    .line 52
    .line 53
    .line 54
    :goto_1
    return-void

    .line 55
    :pswitch_1
    check-cast p0, Lx53;

    .line 56
    .line 57
    invoke-virtual {p0}, Lhq8;->d()Lcj0;

    .line 58
    .line 59
    .line 60
    move-result-object p1

    .line 61
    if-nez p1, :cond_2

    .line 62
    .line 63
    goto :goto_2

    .line 64
    :cond_2
    iget-object p1, p0, Lx53;->x:Lg18;

    .line 65
    .line 66
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 67
    .line 68
    .line 69
    invoke-static {}, Ls08;->b()V

    .line 70
    .line 71
    .line 72
    const/4 v0, 0x1

    .line 73
    iput-boolean v0, p1, Lg18;->f0:Z

    .line 74
    .line 75
    invoke-virtual {p0, v0}, Lx53;->I(Z)V

    .line 76
    .line 77
    .line 78
    invoke-virtual {p0}, Lhq8;->f()Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object p1

    .line 82
    iget-object v1, p0, Lhq8;->h:Ler8;

    .line 83
    .line 84
    check-cast v1, Ly53;

    .line 85
    .line 86
    iget-object v2, p0, Lhq8;->i:Liz;

    .line 87
    .line 88
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 89
    .line 90
    .line 91
    invoke-virtual {p0, p1, v1, v2}, Lx53;->J(Ljava/lang/String;Ly53;Liz;)Lb57;

    .line 92
    .line 93
    .line 94
    move-result-object p1

    .line 95
    iput-object p1, p0, Lx53;->v:Lb57;

    .line 96
    .line 97
    invoke-virtual {p1}, Lb57;->c()Lf57;

    .line 98
    .line 99
    .line 100
    move-result-object p1

    .line 101
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 102
    .line 103
    .line 104
    move-result-object p1

    .line 105
    new-instance v1, Ljava/util/ArrayList;

    .line 106
    .line 107
    invoke-direct {v1, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 108
    .line 109
    .line 110
    const/4 v0, 0x0

    .line 111
    aget-object p1, p1, v0

    .line 112
    .line 113
    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 114
    .line 115
    .line 116
    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 117
    .line 118
    .line 119
    invoke-static {v1}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 120
    .line 121
    .line 122
    move-result-object p1

    .line 123
    invoke-virtual {p0, p1}, Lhq8;->G(Ljava/util/List;)V

    .line 124
    .line 125
    .line 126
    invoke-virtual {p0}, Lhq8;->r()V

    .line 127
    .line 128
    .line 129
    iget-object p0, p0, Lx53;->x:Lg18;

    .line 130
    .line 131
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 132
    .line 133
    .line 134
    invoke-static {}, Ls08;->b()V

    .line 135
    .line 136
    .line 137
    iput-boolean v0, p0, Lg18;->f0:Z

    .line 138
    .line 139
    invoke-virtual {p0}, Lg18;->b()V

    .line 140
    .line 141
    .line 142
    :goto_2
    return-void

    .line 143
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
