.class public final Lnb4;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Liu4;
.implements Landroid/widget/AdapterView$OnItemClickListener;


# instance fields
.field public X:Landroid/content/Context;

.field public Y:Landroid/view/LayoutInflater;

.field public Z:Lnt4;

.field public f0:Landroidx/appcompat/view/menu/ExpandedMenuView;

.field public final g0:I

.field public h0:Lhu4;

.field public i0:Lmb4;


# direct methods
.method public constructor <init>(Landroid/content/ContextWrapper;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p2, p0, Lnb4;->g0:I

    .line 5
    .line 6
    iput-object p1, p0, Lnb4;->X:Landroid/content/Context;

    .line 7
    .line 8
    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    iput-object p1, p0, Lnb4;->Y:Landroid/view/LayoutInflater;

    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final b(Lnt4;Z)V
    .locals 0

    .line 1
    iget-object p0, p0, Lnb4;->h0:Lhu4;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    invoke-interface {p0, p1, p2}, Lhu4;->b(Lnt4;Z)V

    .line 6
    .line 7
    .line 8
    :cond_0
    return-void
.end method

.method public final c(Lgn7;)Z
    .locals 7

    .line 1
    invoke-virtual {p1}, Lnt4;->hasVisibleItems()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    iget-object v1, p1, Lnt4;->a:Landroid/content/Context;

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    const/4 p0, 0x0

    .line 10
    return p0

    .line 11
    :cond_0
    new-instance v0, Lpt4;

    .line 12
    .line 13
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object p1, v0, Lpt4;->X:Lnt4;

    .line 17
    .line 18
    new-instance v2, Lb8;

    .line 19
    .line 20
    invoke-direct {v2, v1}, Lb8;-><init>(Landroid/content/Context;)V

    .line 21
    .line 22
    .line 23
    new-instance v3, Lnb4;

    .line 24
    .line 25
    iget-object v4, v2, Lb8;->c:Ljava/lang/Object;

    .line 26
    .line 27
    check-cast v4, Lx7;

    .line 28
    .line 29
    iget-object v5, v4, Lx7;->c:Ljava/lang/Object;

    .line 30
    .line 31
    check-cast v5, Landroid/view/ContextThemeWrapper;

    .line 32
    .line 33
    sget v6, Lu46;->abc_list_menu_item_layout:I

    .line 34
    .line 35
    invoke-direct {v3, v5, v6}, Lnb4;-><init>(Landroid/content/ContextWrapper;I)V

    .line 36
    .line 37
    .line 38
    iput-object v3, v0, Lpt4;->Z:Lnb4;

    .line 39
    .line 40
    iput-object v0, v3, Lnb4;->h0:Lhu4;

    .line 41
    .line 42
    invoke-virtual {p1, v3, v1}, Lnt4;->b(Liu4;Landroid/content/Context;)V

    .line 43
    .line 44
    .line 45
    iget-object v1, v0, Lpt4;->Z:Lnb4;

    .line 46
    .line 47
    iget-object v3, v1, Lnb4;->i0:Lmb4;

    .line 48
    .line 49
    if-nez v3, :cond_1

    .line 50
    .line 51
    new-instance v3, Lmb4;

    .line 52
    .line 53
    invoke-direct {v3, v1}, Lmb4;-><init>(Lnb4;)V

    .line 54
    .line 55
    .line 56
    iput-object v3, v1, Lnb4;->i0:Lmb4;

    .line 57
    .line 58
    :cond_1
    iput-object v3, v4, Lx7;->j:Ljava/lang/Object;

    .line 59
    .line 60
    iput-object v0, v4, Lx7;->k:Ljava/lang/Object;

    .line 61
    .line 62
    iget-object v1, p1, Lnt4;->o:Landroid/view/View;

    .line 63
    .line 64
    if-eqz v1, :cond_2

    .line 65
    .line 66
    iput-object v1, v4, Lx7;->g:Ljava/lang/Object;

    .line 67
    .line 68
    goto :goto_0

    .line 69
    :cond_2
    iget-object v1, p1, Lnt4;->n:Landroid/graphics/drawable/Drawable;

    .line 70
    .line 71
    iput-object v1, v4, Lx7;->e:Ljava/lang/Object;

    .line 72
    .line 73
    iget-object v1, p1, Lnt4;->m:Ljava/lang/CharSequence;

    .line 74
    .line 75
    iput-object v1, v4, Lx7;->f:Ljava/lang/Object;

    .line 76
    .line 77
    :goto_0
    iput-object v0, v4, Lx7;->i:Ljava/lang/Object;

    .line 78
    .line 79
    invoke-virtual {v2}, Lb8;->d()Lc8;

    .line 80
    .line 81
    .line 82
    move-result-object v1

    .line 83
    iput-object v1, v0, Lpt4;->Y:Lc8;

    .line 84
    .line 85
    invoke-virtual {v1, v0}, Landroid/app/Dialog;->setOnDismissListener(Landroid/content/DialogInterface$OnDismissListener;)V

    .line 86
    .line 87
    .line 88
    iget-object v1, v0, Lpt4;->Y:Lc8;

    .line 89
    .line 90
    invoke-virtual {v1}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    .line 91
    .line 92
    .line 93
    move-result-object v1

    .line 94
    invoke-virtual {v1}, Landroid/view/Window;->getAttributes()Landroid/view/WindowManager$LayoutParams;

    .line 95
    .line 96
    .line 97
    move-result-object v1

    .line 98
    const/16 v2, 0x3eb

    .line 99
    .line 100
    iput v2, v1, Landroid/view/WindowManager$LayoutParams;->type:I

    .line 101
    .line 102
    iget v2, v1, Landroid/view/WindowManager$LayoutParams;->flags:I

    .line 103
    .line 104
    const/high16 v3, 0x20000

    .line 105
    .line 106
    or-int/2addr v2, v3

    .line 107
    iput v2, v1, Landroid/view/WindowManager$LayoutParams;->flags:I

    .line 108
    .line 109
    iget-object v0, v0, Lpt4;->Y:Lc8;

    .line 110
    .line 111
    invoke-virtual {v0}, Landroid/app/Dialog;->show()V

    .line 112
    .line 113
    .line 114
    iget-object p0, p0, Lnb4;->h0:Lhu4;

    .line 115
    .line 116
    if-eqz p0, :cond_3

    .line 117
    .line 118
    invoke-interface {p0, p1}, Lhu4;->N(Lnt4;)Z

    .line 119
    .line 120
    .line 121
    :cond_3
    const/4 p0, 0x1

    .line 122
    return p0
.end method

.method public final d()Z
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
.end method

.method public final e(Lst4;)Z
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
.end method

.method public final g(Lhu4;)V
    .locals 0

    const/4 p0, 0x0

    throw p0
.end method

.method public final h(Lst4;)Z
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
.end method

.method public final i()V
    .locals 0

    .line 1
    iget-object p0, p0, Lnb4;->i0:Lmb4;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, Lmb4;->notifyDataSetChanged()V

    .line 6
    .line 7
    .line 8
    :cond_0
    return-void
.end method

.method public final k(Landroid/content/Context;Lnt4;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lnb4;->X:Landroid/content/Context;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iput-object p1, p0, Lnb4;->X:Landroid/content/Context;

    .line 6
    .line 7
    iget-object v0, p0, Lnb4;->Y:Landroid/view/LayoutInflater;

    .line 8
    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    iput-object p1, p0, Lnb4;->Y:Landroid/view/LayoutInflater;

    .line 16
    .line 17
    :cond_0
    iput-object p2, p0, Lnb4;->Z:Lnt4;

    .line 18
    .line 19
    iget-object p0, p0, Lnb4;->i0:Lmb4;

    .line 20
    .line 21
    if-eqz p0, :cond_1

    .line 22
    .line 23
    invoke-virtual {p0}, Lmb4;->notifyDataSetChanged()V

    .line 24
    .line 25
    .line 26
    :cond_1
    return-void
.end method

.method public final onItemClick(Landroid/widget/AdapterView;Landroid/view/View;IJ)V
    .locals 0

    .line 1
    iget-object p1, p0, Lnb4;->Z:Lnt4;

    .line 2
    .line 3
    iget-object p2, p0, Lnb4;->i0:Lmb4;

    .line 4
    .line 5
    invoke-virtual {p2, p3}, Lmb4;->b(I)Lst4;

    .line 6
    .line 7
    .line 8
    move-result-object p2

    .line 9
    const/4 p3, 0x0

    .line 10
    invoke-virtual {p1, p2, p0, p3}, Lnt4;->q(Landroid/view/MenuItem;Liu4;I)Z

    .line 11
    .line 12
    .line 13
    return-void
.end method
