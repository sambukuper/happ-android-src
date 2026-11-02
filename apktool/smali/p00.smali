.class public final Lp00;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Ldq1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Ljava/lang/Object;

.field public final synthetic c:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, Lp00;->a:B

    .line 2
    .line 3
    iput-object p1, p0, Lp00;->b:Ljava/lang/Object;

    .line 4
    .line 5
    iput-object p2, p0, Lp00;->c:Ljava/lang/Object;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 2

    .line 1
    iget-byte v0, p0, Lp00;->a:B

    .line 2
    .line 3
    iget-object v1, p0, Lp00;->c:Ljava/lang/Object;

    .line 4
    .line 5
    iget-object p0, p0, Lp00;->b:Ljava/lang/Object;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    check-cast p0, Lc29;

    .line 11
    .line 12
    check-cast v1, Landroid/view/View;

    .line 13
    .line 14
    iget v0, p0, Lc29;->u:I

    .line 15
    .line 16
    add-int/lit8 v0, v0, -0x1

    .line 17
    .line 18
    iput v0, p0, Lc29;->u:I

    .line 19
    .line 20
    if-nez v0, :cond_0

    .line 21
    .line 22
    sget-object v0, Lcw8;->a:Ljava/util/WeakHashMap;

    .line 23
    .line 24
    const/4 v0, 0x0

    .line 25
    invoke-static {v1, v0}, Luv8;->c(Landroid/view/View;Lp95;)V

    .line 26
    .line 27
    .line 28
    invoke-static {v1, v0}, Lc19;->a(Landroid/view/View;Ljv0;)V

    .line 29
    .line 30
    .line 31
    iget-object p0, p0, Lc29;->v:Lke3;

    .line 32
    .line 33
    invoke-virtual {v1, p0}, Landroid/view/View;->removeOnAttachStateChangeListener(Landroid/view/View$OnAttachStateChangeListener;)V

    .line 34
    .line 35
    .line 36
    :cond_0
    return-void

    .line 37
    :pswitch_0
    check-cast p0, Lce8;

    .line 38
    .line 39
    check-cast v1, Lyd8;

    .line 40
    .line 41
    iget-object p0, p0, Lce8;->j:Lvd7;

    .line 42
    .line 43
    invoke-virtual {p0, v1}, Lvd7;->remove(Ljava/lang/Object;)Z

    .line 44
    .line 45
    .line 46
    return-void

    .line 47
    :pswitch_1
    check-cast p0, Lce8;

    .line 48
    .line 49
    check-cast v1, Lsd8;

    .line 50
    .line 51
    iget-object v0, v1, Lsd8;->b:Lrh5;

    .line 52
    .line 53
    invoke-virtual {v0}, Lrh5;->getValue()Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    check-cast v0, Lrd8;

    .line 58
    .line 59
    if-eqz v0, :cond_1

    .line 60
    .line 61
    iget-object v0, v0, Lrd8;->X:Lyd8;

    .line 62
    .line 63
    iget-object p0, p0, Lce8;->j:Lvd7;

    .line 64
    .line 65
    invoke-virtual {p0, v0}, Lvd7;->remove(Ljava/lang/Object;)Z

    .line 66
    .line 67
    .line 68
    :cond_1
    return-void

    .line 69
    :pswitch_2
    check-cast p0, Lce8;

    .line 70
    .line 71
    check-cast v1, Lce8;

    .line 72
    .line 73
    iget-object p0, p0, Lce8;->k:Lvd7;

    .line 74
    .line 75
    invoke-virtual {p0, v1}, Lvd7;->remove(Ljava/lang/Object;)Z

    .line 76
    .line 77
    .line 78
    return-void

    .line 79
    :pswitch_3
    check-cast p0, Lb88;

    .line 80
    .line 81
    iget-object p0, p0, Lb88;->c:Lvd7;

    .line 82
    .line 83
    check-cast v1, Lgn2;

    .line 84
    .line 85
    invoke-virtual {p0, v1}, Lvd7;->remove(Ljava/lang/Object;)Z

    .line 86
    .line 87
    .line 88
    return-void

    .line 89
    :pswitch_4
    check-cast p0, Ld94;

    .line 90
    .line 91
    invoke-interface {p0}, Ld94;->h()Lg94;

    .line 92
    .line 93
    .line 94
    move-result-object p0

    .line 95
    check-cast v1, Lfy0;

    .line 96
    .line 97
    invoke-virtual {p0, v1}, Lg94;->f(Lc94;)V

    .line 98
    .line 99
    .line 100
    return-void

    .line 101
    :pswitch_5
    check-cast p0, Lo74;

    .line 102
    .line 103
    iget-object p0, p0, Lo74;->Z:Lt05;

    .line 104
    .line 105
    invoke-virtual {p0, v1}, Lt05;->k(Ljava/lang/Object;)V

    .line 106
    .line 107
    .line 108
    return-void

    .line 109
    :pswitch_6
    check-cast p0, Lnc3;

    .line 110
    .line 111
    check-cast v1, Llc3;

    .line 112
    .line 113
    iget-object p0, p0, Lnc3;->a:Lc15;

    .line 114
    .line 115
    invoke-virtual {p0, v1}, Lc15;->j(Ljava/lang/Object;)Z

    .line 116
    .line 117
    .line 118
    return-void

    .line 119
    :pswitch_7
    check-cast p0, Lm00;

    .line 120
    .line 121
    check-cast v1, Lfz0;

    .line 122
    .line 123
    iget-object v0, p0, Lm00;->a:Lz47;

    .line 124
    .line 125
    if-eqz v0, :cond_2

    .line 126
    .line 127
    iget-object p0, v1, Lfz0;->b:Lk00;

    .line 128
    .line 129
    invoke-virtual {p0}, Lk25;->e()V

    .line 130
    .line 131
    .line 132
    goto :goto_0

    .line 133
    :cond_2
    iget-object p0, p0, Lm00;->b:Lz95;

    .line 134
    .line 135
    if-eqz p0, :cond_3

    .line 136
    .line 137
    iget-object p0, v1, Lfz0;->a:Ll00;

    .line 138
    .line 139
    invoke-virtual {p0}, Lu95;->e()V

    .line 140
    .line 141
    .line 142
    goto :goto_0

    .line 143
    :cond_3
    const-string p0, "Unreachable"

    .line 144
    .line 145
    invoke-static {p0}, Lbt;->i(Ljava/lang/String;)V

    .line 146
    .line 147
    .line 148
    :goto_0
    return-void

    .line 149
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
