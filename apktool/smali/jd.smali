.class public final Ljd;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Ldq1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, Ljd;->a:B

    .line 2
    .line 3
    iput-object p1, p0, Ljd;->b:Ljava/lang/Object;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 3

    .line 1
    iget-byte v0, p0, Ljd;->a:B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x0

    .line 5
    iget-object p0, p0, Ljd;->b:Ljava/lang/Object;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    check-cast p0, Low4;

    .line 11
    .line 12
    invoke-virtual {p0}, Landroid/app/Dialog;->dismiss()V

    .line 13
    .line 14
    .line 15
    iget-object p0, p0, Low4;->k0:Llw4;

    .line 16
    .line 17
    invoke-virtual {p0}, Landroidx/compose/ui/platform/AbstractComposeView;->e()V

    .line 18
    .line 19
    .line 20
    return-void

    .line 21
    :pswitch_0
    check-cast p0, Lk64;

    .line 22
    .line 23
    const/4 v0, 0x1

    .line 24
    iput-boolean v0, p0, Lk64;->f:Z

    .line 25
    .line 26
    iput v1, p0, Lk64;->d:I

    .line 27
    .line 28
    invoke-virtual {p0}, Lk64;->c()V

    .line 29
    .line 30
    .line 31
    return-void

    .line 32
    :pswitch_1
    check-cast p0, Lp64;

    .line 33
    .line 34
    iget-object v0, p0, Lp64;->c:Lsa2;

    .line 35
    .line 36
    if-eqz v0, :cond_0

    .line 37
    .line 38
    iput-boolean v1, v0, Lsa2;->b:Z

    .line 39
    .line 40
    :cond_0
    iput-object v2, p0, Lp64;->c:Lsa2;

    .line 41
    .line 42
    return-void

    .line 43
    :pswitch_2
    check-cast p0, Le64;

    .line 44
    .line 45
    iput-object v2, p0, Le64;->d:Lzy0;

    .line 46
    .line 47
    return-void

    .line 48
    :pswitch_3
    check-cast p0, Ljc8;

    .line 49
    .line 50
    iget-object p0, p0, Ljc8;->d:Lmm0;

    .line 51
    .line 52
    if-eqz p0, :cond_1

    .line 53
    .line 54
    invoke-virtual {p0, v2}, Lmm0;->z(Ljava/lang/Throwable;)Z

    .line 55
    .line 56
    .line 57
    :cond_1
    return-void

    .line 58
    :pswitch_4
    check-cast p0, Lr68;

    .line 59
    .line 60
    invoke-virtual {p0}, Lr68;->r()V

    .line 61
    .line 62
    .line 63
    iput-object v2, p0, Lr68;->j:Lez2;

    .line 64
    .line 65
    return-void

    .line 66
    :pswitch_5
    check-cast p0, Li30;

    .line 67
    .line 68
    iget-object p0, p0, Li30;->c:Lrh5;

    .line 69
    .line 70
    invoke-virtual {p0}, Lrh5;->getValue()Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object p0

    .line 74
    check-cast p0, Lh30;

    .line 75
    .line 76
    if-eqz p0, :cond_2

    .line 77
    .line 78
    invoke-virtual {p0}, Lh30;->close()V

    .line 79
    .line 80
    .line 81
    :cond_2
    return-void

    .line 82
    :pswitch_6
    check-cast p0, Lch;

    .line 83
    .line 84
    iget-object v0, p0, Lch;->e:Lxd7;

    .line 85
    .line 86
    iget-object v1, v0, Lxd7;->h:Lo61;

    .line 87
    .line 88
    if-eqz v1, :cond_3

    .line 89
    .line 90
    invoke-virtual {v1}, Lo61;->h()V

    .line 91
    .line 92
    .line 93
    :cond_3
    invoke-virtual {v0}, Lxd7;->a()V

    .line 94
    .line 95
    .line 96
    iget-object v0, p0, Lch;->h:Landroid/view/ActionMode;

    .line 97
    .line 98
    if-eqz v0, :cond_4

    .line 99
    .line 100
    invoke-virtual {v0}, Landroid/view/ActionMode;->finish()V

    .line 101
    .line 102
    .line 103
    :cond_4
    iput-object v2, p0, Lch;->h:Landroid/view/ActionMode;

    .line 104
    .line 105
    return-void

    .line 106
    :pswitch_7
    check-cast p0, Lir5;

    .line 107
    .line 108
    invoke-virtual {p0}, Landroidx/compose/ui/platform/AbstractComposeView;->e()V

    .line 109
    .line 110
    .line 111
    sget v0, Lv36;->view_tree_lifecycle_owner:I

    .line 112
    .line 113
    invoke-virtual {p0, v0, v2}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 114
    .line 115
    .line 116
    iget-object v0, p0, Lir5;->v0:Landroid/view/WindowManager;

    .line 117
    .line 118
    invoke-interface {v0, p0}, Landroid/view/WindowManager;->removeViewImmediate(Landroid/view/View;)V

    .line 119
    .line 120
    .line 121
    return-void

    .line 122
    :pswitch_8
    check-cast p0, Loo1;

    .line 123
    .line 124
    invoke-virtual {p0}, Landroid/app/Dialog;->dismiss()V

    .line 125
    .line 126
    .line 127
    iget-object p0, p0, Loo1;->j0:Lun1;

    .line 128
    .line 129
    invoke-virtual {p0}, Landroidx/compose/ui/platform/AbstractComposeView;->e()V

    .line 130
    .line 131
    .line 132
    return-void

    .line 133
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_8
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
