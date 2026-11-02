.class public final Lfc8;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Li04;
.implements Lov8;


# instance fields
.field public final synthetic X:B

.field public Y:Ljava/lang/Object;

.field public Z:Ljava/lang/Object;

.field public f0:Ljava/lang/Object;

.field public g0:Ljava/lang/Object;

.field public h0:Ljava/lang/Object;

.field public i0:Ljava/lang/Object;

.field public j0:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>()V
    .locals 1

    .line 103
    const/4 v0, 0x1

    iput-byte v0, p0, Lfc8;->X:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 4

    const/4 v0, 0x0

    iput-byte v0, p0, Lfc8;->X:B

    .line 112
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 113
    new-instance v0, Landroid/view/WindowManager$LayoutParams;

    invoke-direct {v0}, Landroid/view/WindowManager$LayoutParams;-><init>()V

    iput-object v0, p0, Lfc8;->g0:Ljava/lang/Object;

    .line 114
    new-instance v1, Landroid/graphics/Rect;

    invoke-direct {v1}, Landroid/graphics/Rect;-><init>()V

    iput-object v1, p0, Lfc8;->h0:Ljava/lang/Object;

    const/4 v1, 0x2

    .line 115
    new-array v2, v1, [I

    iput-object v2, p0, Lfc8;->i0:Ljava/lang/Object;

    .line 116
    new-array v1, v1, [I

    iput-object v1, p0, Lfc8;->j0:Ljava/lang/Object;

    .line 117
    iput-object p1, p0, Lfc8;->Y:Ljava/lang/Object;

    .line 118
    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v1

    sget v2, Lu46;->abc_tooltip:I

    const/4 v3, 0x0

    invoke-virtual {v1, v2, v3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v1

    iput-object v1, p0, Lfc8;->Z:Ljava/lang/Object;

    .line 119
    sget v2, Ld46;->message:I

    invoke-virtual {v1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    iput-object v1, p0, Lfc8;->f0:Ljava/lang/Object;

    .line 120
    const-class p0, Lfc8;

    invoke-virtual {p0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Landroid/view/WindowManager$LayoutParams;->setTitle(Ljava/lang/CharSequence;)V

    .line 121
    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object p0

    iput-object p0, v0, Landroid/view/WindowManager$LayoutParams;->packageName:Ljava/lang/String;

    const/16 p0, 0x3ea

    .line 122
    iput p0, v0, Landroid/view/WindowManager$LayoutParams;->type:I

    const/4 p0, -0x2

    .line 123
    iput p0, v0, Landroid/view/WindowManager$LayoutParams;->width:I

    .line 124
    iput p0, v0, Landroid/view/WindowManager$LayoutParams;->height:I

    const/4 p0, -0x3

    .line 125
    iput p0, v0, Landroid/view/WindowManager$LayoutParams;->format:I

    .line 126
    sget p0, Lq56;->Animation_AppCompat_Tooltip:I

    iput p0, v0, Landroid/view/WindowManager$LayoutParams;->windowAnimations:I

    const/16 p0, 0x18

    .line 127
    iput p0, v0, Landroid/view/WindowManager$LayoutParams;->flags:I

    return-void
.end method

.method public constructor <init>(Landroidx/cardview/widget/CardView;Landroidx/appcompat/widget/AppCompatImageView;Landroidx/constraintlayout/widget/ConstraintLayout;Landroidx/constraintlayout/widget/ConstraintLayout;Landroidx/appcompat/widget/AppCompatImageView;Landroidx/appcompat/widget/AppCompatImageView;Lsu/happ/proxyutility/ui/foundation/component/HappTextView;)V
    .locals 1

    const/4 v0, 0x3

    iput-byte v0, p0, Lfc8;->X:B

    .line 104
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 105
    iput-object p1, p0, Lfc8;->Y:Ljava/lang/Object;

    .line 106
    iput-object p2, p0, Lfc8;->Z:Ljava/lang/Object;

    .line 107
    iput-object p3, p0, Lfc8;->f0:Ljava/lang/Object;

    .line 108
    iput-object p4, p0, Lfc8;->g0:Ljava/lang/Object;

    .line 109
    iput-object p5, p0, Lfc8;->h0:Ljava/lang/Object;

    .line 110
    iput-object p6, p0, Lfc8;->i0:Ljava/lang/Object;

    .line 111
    iput-object p7, p0, Lfc8;->j0:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lfu6;Lsx4;Lqs0;Ljava/util/List;Lke7;)V
    .locals 1

    const/4 v0, 0x2

    iput-byte v0, p0, Lfc8;->X:B

    .line 128
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 129
    iput-object p1, p0, Lfc8;->f0:Ljava/lang/Object;

    iput-object p2, p0, Lfc8;->g0:Ljava/lang/Object;

    iput-object p3, p0, Lfc8;->h0:Ljava/lang/Object;

    iput-object p4, p0, Lfc8;->i0:Ljava/lang/Object;

    iput-object p5, p0, Lfc8;->j0:Ljava/lang/Object;

    .line 130
    iput-object p1, p0, Lfc8;->Y:Ljava/lang/Object;

    .line 131
    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    iput-object p1, p0, Lfc8;->Z:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Ljl1;Lfc8;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)V
    .locals 3

    .line 1
    const/4 v0, 0x4

    .line 2
    iput-byte v0, p0, Lfc8;->X:B

    .line 3
    .line 4
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object p1, p0, Lfc8;->Y:Ljava/lang/Object;

    .line 11
    .line 12
    iput-object p2, p0, Lfc8;->Z:Ljava/lang/Object;

    .line 13
    .line 14
    iput-object p4, p0, Lfc8;->f0:Ljava/lang/Object;

    .line 15
    .line 16
    iput-object p5, p0, Lfc8;->g0:Ljava/lang/Object;

    .line 17
    .line 18
    iget-object p1, p1, Ljl1;->X:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast p1, Lhl1;

    .line 21
    .line 22
    iget-object p1, p1, Lhl1;->a:Lve4;

    .line 23
    .line 24
    new-instance p2, Loh8;

    .line 25
    .line 26
    const/4 p4, 0x0

    .line 27
    invoke-direct {p2, p0, p4}, Loh8;-><init>(Lfc8;B)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {p1, p2}, Lve4;->c(Lgn2;)Lvt1;

    .line 31
    .line 32
    .line 33
    move-result-object p2

    .line 34
    iput-object p2, p0, Lfc8;->h0:Ljava/lang/Object;

    .line 35
    .line 36
    new-instance p2, Loh8;

    .line 37
    .line 38
    const/4 p5, 0x1

    .line 39
    invoke-direct {p2, p0, p5}, Loh8;-><init>(Lfc8;B)V

    .line 40
    .line 41
    .line 42
    invoke-virtual {p1, p2}, Lve4;->c(Lgn2;)Lvt1;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    iput-object p1, p0, Lfc8;->i0:Ljava/lang/Object;

    .line 47
    .line 48
    invoke-interface {p3}, Ljava/util/List;->isEmpty()Z

    .line 49
    .line 50
    .line 51
    move-result p1

    .line 52
    if-eqz p1, :cond_0

    .line 53
    .line 54
    sget-object p1, Le02;->X:Le02;

    .line 55
    .line 56
    goto :goto_1

    .line 57
    :cond_0
    new-instance p1, Ljava/util/LinkedHashMap;

    .line 58
    .line 59
    invoke-direct {p1}, Ljava/util/LinkedHashMap;-><init>()V

    .line 60
    .line 61
    .line 62
    invoke-interface {p3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 63
    .line 64
    .line 65
    move-result-object p2

    .line 66
    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 67
    .line 68
    .line 69
    move-result p3

    .line 70
    if-eqz p3, :cond_1

    .line 71
    .line 72
    add-int/lit8 p3, p4, 0x1

    .line 73
    .line 74
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object p5

    .line 78
    check-cast p5, Lsz5;

    .line 79
    .line 80
    iget v0, p5, Lsz5;->f0:I

    .line 81
    .line 82
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 83
    .line 84
    .line 85
    move-result-object v0

    .line 86
    new-instance v1, Llm1;

    .line 87
    .line 88
    iget-object v2, p0, Lfc8;->Y:Ljava/lang/Object;

    .line 89
    .line 90
    check-cast v2, Ljl1;

    .line 91
    .line 92
    invoke-direct {v1, v2, p5, p4}, Llm1;-><init>(Ljl1;Lsz5;I)V

    .line 93
    .line 94
    .line 95
    invoke-interface {p1, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 96
    .line 97
    .line 98
    move p4, p3

    .line 99
    goto :goto_0

    .line 100
    :cond_1
    :goto_1
    iput-object p1, p0, Lfc8;->j0:Ljava/lang/Object;

    .line 101
    .line 102
    return-void
.end method

.method public static a(Laa7;Lt14;)Laa7;
    .locals 7

    .line 1
    invoke-static {p0}, Ly08;->e(Lt14;)Lzz3;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p0}, Lt14;->getAnnotations()Lsm;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-static {p0}, Lw79;->A(Lt14;)Lt14;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    invoke-static {p0}, Lw79;->w(Lt14;)Ljava/util/List;

    .line 14
    .line 15
    .line 16
    move-result-object v3

    .line 17
    invoke-static {p0}, Lw79;->C(Lt14;)Ljava/util/List;

    .line 18
    .line 19
    .line 20
    move-result-object v4

    .line 21
    const/4 v5, 0x1

    .line 22
    invoke-static {v5, v4}, Lwv0;->p0(ILjava/util/List;)Ljava/util/List;

    .line 23
    .line 24
    .line 25
    move-result-object v4

    .line 26
    move-object v5, v4

    .line 27
    new-instance v4, Ljava/util/ArrayList;

    .line 28
    .line 29
    const/16 v6, 0xa

    .line 30
    .line 31
    invoke-static {v5, v6}, Lxv0;->Z(Ljava/lang/Iterable;I)I

    .line 32
    .line 33
    .line 34
    move-result v6

    .line 35
    invoke-direct {v4, v6}, Ljava/util/ArrayList;-><init>(I)V

    .line 36
    .line 37
    .line 38
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 39
    .line 40
    .line 41
    move-result-object v5

    .line 42
    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 43
    .line 44
    .line 45
    move-result v6

    .line 46
    if-eqz v6, :cond_0

    .line 47
    .line 48
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object v6

    .line 52
    check-cast v6, Lni8;

    .line 53
    .line 54
    invoke-virtual {v6}, Lni8;->b()Lt14;

    .line 55
    .line 56
    .line 57
    move-result-object v6

    .line 58
    invoke-virtual {v4, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 59
    .line 60
    .line 61
    goto :goto_0

    .line 62
    :cond_0
    const/4 v6, 0x1

    .line 63
    move-object v5, p1

    .line 64
    invoke-static/range {v0 .. v6}, Lw79;->p(Lzz3;Lsm;Lt14;Ljava/util/List;Ljava/util/ArrayList;Lt14;Z)Laa7;

    .line 65
    .line 66
    .line 67
    move-result-object p1

    .line 68
    invoke-virtual {p0}, Lt14;->o0()Z

    .line 69
    .line 70
    .line 71
    move-result p0

    .line 72
    invoke-virtual {p1, p0}, Laa7;->u0(Z)Laa7;

    .line 73
    .line 74
    .line 75
    move-result-object p0

    .line 76
    return-object p0
.end method

.method public static final f(Lnz5;Lfc8;)Ljava/util/ArrayList;
    .locals 2

    .line 1
    iget-object v0, p0, Lnz5;->f0:Ljava/util/List;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    iget-object v1, p1, Lfc8;->Y:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v1, Ljl1;

    .line 9
    .line 10
    iget-object v1, v1, Ljl1;->f0:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v1, Lux4;

    .line 13
    .line 14
    invoke-static {p0, v1}, Lvr3;->R(Lnz5;Lux4;)Lnz5;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    if-eqz p0, :cond_0

    .line 19
    .line 20
    invoke-static {p0, p1}, Lfc8;->f(Lnz5;Lfc8;)Ljava/util/ArrayList;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    goto :goto_0

    .line 25
    :cond_0
    const/4 p0, 0x0

    .line 26
    :goto_0
    if-nez p0, :cond_1

    .line 27
    .line 28
    sget-object p0, Ld02;->X:Ld02;

    .line 29
    .line 30
    :cond_1
    invoke-static {v0, p0}, Lwv0;->H0(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    return-object p0
.end method

.method public static h(Ljava/util/List;Lsm;)Lch8;
    .locals 3

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    const/16 v1, 0xa

    .line 4
    .line 5
    invoke-static {p0, v1}, Lxv0;->Z(Ljava/lang/Iterable;I)I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 10
    .line 11
    .line 12
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

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
    move-result v1

    .line 20
    if-eqz v1, :cond_1

    .line 21
    .line 22
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    check-cast v1, Lqg1;

    .line 27
    .line 28
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 29
    .line 30
    .line 31
    invoke-interface {p1}, Lsm;->isEmpty()Z

    .line 32
    .line 33
    .line 34
    move-result v1

    .line 35
    if-eqz v1, :cond_0

    .line 36
    .line 37
    sget-object v1, Lch8;->Y:Lxd6;

    .line 38
    .line 39
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 40
    .line 41
    .line 42
    sget-object v1, Lch8;->Z:Lch8;

    .line 43
    .line 44
    goto :goto_1

    .line 45
    :cond_0
    sget-object v1, Lch8;->Y:Lxd6;

    .line 46
    .line 47
    new-instance v2, Lwm;

    .line 48
    .line 49
    invoke-direct {v2, p1}, Lwm;-><init>(Lsm;)V

    .line 50
    .line 51
    .line 52
    invoke-static {v2}, Li21;->K(Ljava/lang/Object;)Ljava/util/List;

    .line 53
    .line 54
    .line 55
    move-result-object v2

    .line 56
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 57
    .line 58
    .line 59
    invoke-static {v2}, Lxd6;->k(Ljava/util/List;)Lch8;

    .line 60
    .line 61
    .line 62
    move-result-object v1

    .line 63
    :goto_1
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 64
    .line 65
    .line 66
    goto :goto_0

    .line 67
    :cond_1
    invoke-static {v0}, Lxv0;->a0(Ljava/lang/Iterable;)Ljava/util/ArrayList;

    .line 68
    .line 69
    .line 70
    move-result-object p0

    .line 71
    sget-object p1, Lch8;->Y:Lxd6;

    .line 72
    .line 73
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 74
    .line 75
    .line 76
    invoke-static {p0}, Lxd6;->k(Ljava/util/List;)Lch8;

    .line 77
    .line 78
    .line 79
    move-result-object p0

    .line 80
    return-object p0
.end method

.method public static final j(Lfc8;Lnz5;I)Lsx4;
    .locals 3

    .line 1
    iget-object v0, p0, Lfc8;->Y:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljl1;

    .line 4
    .line 5
    iget-object v1, v0, Ljl1;->Y:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, Lw15;

    .line 8
    .line 9
    invoke-static {v1, p2}, Lu70;->L(Lw15;I)Lqs0;

    .line 10
    .line 11
    .line 12
    move-result-object p2

    .line 13
    new-instance v1, Loh8;

    .line 14
    .line 15
    const/4 v2, 0x2

    .line 16
    invoke-direct {v1, p0, v2}, Loh8;-><init>(Lfc8;B)V

    .line 17
    .line 18
    .line 19
    invoke-static {p1, v1}, Lw27;->i0(Ljava/lang/Object;Lgn2;)Lu27;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    sget-object p1, Lve7;->Z:Lve7;

    .line 24
    .line 25
    invoke-static {p0, p1}, Lw27;->l0(Lu27;Lgn2;)Lmd8;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    new-instance p1, Ljava/util/ArrayList;

    .line 30
    .line 31
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 32
    .line 33
    .line 34
    invoke-virtual {p0}, Lmd8;->iterator()Ljava/util/Iterator;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    :goto_0
    move-object v1, p0

    .line 39
    check-cast v1, Lld8;

    .line 40
    .line 41
    invoke-virtual {v1}, Lld8;->hasNext()Z

    .line 42
    .line 43
    .line 44
    move-result v2

    .line 45
    if-eqz v2, :cond_0

    .line 46
    .line 47
    invoke-virtual {v1}, Lld8;->next()Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object v1

    .line 51
    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 52
    .line 53
    .line 54
    goto :goto_0

    .line 55
    :cond_0
    sget-object p0, Lph8;->X:Lph8;

    .line 56
    .line 57
    invoke-static {p2, p0}, Lw27;->i0(Ljava/lang/Object;Lgn2;)Lu27;

    .line 58
    .line 59
    .line 60
    move-result-object p0

    .line 61
    invoke-static {p0}, Lw27;->e0(Lu27;)I

    .line 62
    .line 63
    .line 64
    move-result p0

    .line 65
    :goto_1
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 66
    .line 67
    .line 68
    move-result v1

    .line 69
    if-ge v1, p0, :cond_1

    .line 70
    .line 71
    const/4 v1, 0x0

    .line 72
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 73
    .line 74
    .line 75
    move-result-object v1

    .line 76
    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 77
    .line 78
    .line 79
    goto :goto_1

    .line 80
    :cond_1
    iget-object p0, v0, Ljl1;->X:Ljava/lang/Object;

    .line 81
    .line 82
    check-cast p0, Lhl1;

    .line 83
    .line 84
    iget-object p0, p0, Lhl1;->l:Lz47;

    .line 85
    .line 86
    invoke-virtual {p0, p2, p1}, Lz47;->E(Lqs0;Ljava/util/List;)Lsx4;

    .line 87
    .line 88
    .line 89
    move-result-object p0

    .line 90
    return-object p0
.end method


# virtual methods
.method public b()Ljava/util/List;
    .locals 0

    .line 1
    iget-object p0, p0, Lfc8;->j0:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Ljava/util/Map;

    .line 4
    .line 5
    invoke-interface {p0}, Ljava/util/Map;->values()Ljava/util/Collection;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, Ljava/lang/Iterable;

    .line 10
    .line 11
    invoke-static {p0}, Lwv0;->Y0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    return-object p0
.end method

.method public c()V
    .locals 7

    .line 1
    iget-object v0, p0, Lfc8;->f0:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lfu6;

    .line 4
    .line 5
    iget-object v1, p0, Lfc8;->h0:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, Lqs0;

    .line 8
    .line 9
    iget-object v2, p0, Lfc8;->Z:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v2, Ljava/util/HashMap;

    .line 12
    .line 13
    sget-object v3, Lgf7;->b:Lqs0;

    .line 14
    .line 15
    invoke-virtual {v1, v3}, Lqs0;->equals(Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result v3

    .line 19
    const/4 v4, 0x0

    .line 20
    if-nez v3, :cond_0

    .line 21
    .line 22
    goto :goto_1

    .line 23
    :cond_0
    const-string v3, "value"

    .line 24
    .line 25
    invoke-static {v3}, Lv15;->e(Ljava/lang/String;)Lv15;

    .line 26
    .line 27
    .line 28
    move-result-object v3

    .line 29
    invoke-virtual {v2, v3}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v3

    .line 33
    instance-of v5, v3, Lkv3;

    .line 34
    .line 35
    const/4 v6, 0x0

    .line 36
    if-eqz v5, :cond_1

    .line 37
    .line 38
    check-cast v3, Lkv3;

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_1
    move-object v3, v6

    .line 42
    :goto_0
    if-nez v3, :cond_2

    .line 43
    .line 44
    goto :goto_1

    .line 45
    :cond_2
    iget-object v3, v3, Ls21;->a:Ljava/lang/Object;

    .line 46
    .line 47
    instance-of v5, v3, Liv3;

    .line 48
    .line 49
    if-eqz v5, :cond_3

    .line 50
    .line 51
    move-object v6, v3

    .line 52
    check-cast v6, Liv3;

    .line 53
    .line 54
    :cond_3
    if-nez v6, :cond_4

    .line 55
    .line 56
    goto :goto_1

    .line 57
    :cond_4
    iget-object v3, v6, Liv3;->a:Lvs0;

    .line 58
    .line 59
    iget-object v3, v3, Lvs0;->a:Lqs0;

    .line 60
    .line 61
    invoke-virtual {v0, v3}, Lfu6;->Y(Lqs0;)Z

    .line 62
    .line 63
    .line 64
    move-result v4

    .line 65
    :goto_1
    if-eqz v4, :cond_5

    .line 66
    .line 67
    goto :goto_2

    .line 68
    :cond_5
    invoke-virtual {v0, v1}, Lfu6;->Y(Lqs0;)Z

    .line 69
    .line 70
    .line 71
    move-result v0

    .line 72
    if-eqz v0, :cond_6

    .line 73
    .line 74
    :goto_2
    return-void

    .line 75
    :cond_6
    iget-object v0, p0, Lfc8;->i0:Ljava/lang/Object;

    .line 76
    .line 77
    check-cast v0, Ljava/util/List;

    .line 78
    .line 79
    new-instance v1, Lhm;

    .line 80
    .line 81
    iget-object v3, p0, Lfc8;->g0:Ljava/lang/Object;

    .line 82
    .line 83
    check-cast v3, Lsx4;

    .line 84
    .line 85
    invoke-virtual {v3}, Lsx4;->X()Laa7;

    .line 86
    .line 87
    .line 88
    move-result-object v3

    .line 89
    iget-object p0, p0, Lfc8;->j0:Ljava/lang/Object;

    .line 90
    .line 91
    check-cast p0, Lke7;

    .line 92
    .line 93
    invoke-direct {v1, v3, v2, p0}, Lhm;-><init>(Laa7;Ljava/util/Map;Lke7;)V

    .line 94
    .line 95
    .line 96
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 97
    .line 98
    .line 99
    return-void
.end method

.method public d(I)Lhi8;
    .locals 2

    .line 1
    iget-object v0, p0, Lfc8;->j0:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/util/Map;

    .line 4
    .line 5
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    check-cast v0, Lhi8;

    .line 14
    .line 15
    if-nez v0, :cond_1

    .line 16
    .line 17
    iget-object p0, p0, Lfc8;->Z:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast p0, Lfc8;

    .line 20
    .line 21
    if-eqz p0, :cond_0

    .line 22
    .line 23
    invoke-virtual {p0, p1}, Lfc8;->d(I)Lhi8;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    return-object p0

    .line 28
    :cond_0
    const/4 p0, 0x0

    .line 29
    return-object p0

    .line 30
    :cond_1
    return-object v0
.end method

.method public e(Lnz5;Z)Laa7;
    .locals 25

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iget-object v2, v0, Lfc8;->Y:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v2, Ljl1;

    .line 8
    .line 9
    iget-object v3, v2, Ljl1;->f0:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v3, Lux4;

    .line 12
    .line 13
    iget-object v4, v2, Ljl1;->Z:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v4, Led1;

    .line 16
    .line 17
    iget-object v5, v2, Ljl1;->X:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast v5, Lhl1;

    .line 20
    .line 21
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    invoke-virtual {v1}, Lnz5;->p()Z

    .line 25
    .line 26
    .line 27
    move-result v6

    .line 28
    const/16 v7, 0x80

    .line 29
    .line 30
    if-eqz v6, :cond_0

    .line 31
    .line 32
    iget v6, v1, Lnz5;->k0:I

    .line 33
    .line 34
    iget-object v8, v2, Ljl1;->Y:Ljava/lang/Object;

    .line 35
    .line 36
    check-cast v8, Lw15;

    .line 37
    .line 38
    invoke-static {v8, v6}, Lu70;->L(Lw15;I)Lqs0;

    .line 39
    .line 40
    .line 41
    move-result-object v6

    .line 42
    iget-boolean v6, v6, Lqs0;->c:Z

    .line 43
    .line 44
    if-eqz v6, :cond_1

    .line 45
    .line 46
    iget-object v6, v2, Ljl1;->X:Ljava/lang/Object;

    .line 47
    .line 48
    check-cast v6, Lhl1;

    .line 49
    .line 50
    iget-object v6, v6, Lhl1;->g:Lpz2;

    .line 51
    .line 52
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 53
    .line 54
    .line 55
    goto :goto_0

    .line 56
    :cond_0
    iget v6, v1, Lnz5;->Z:I

    .line 57
    .line 58
    and-int/2addr v6, v7

    .line 59
    if-ne v6, v7, :cond_1

    .line 60
    .line 61
    iget v6, v1, Lnz5;->n0:I

    .line 62
    .line 63
    iget-object v8, v2, Ljl1;->Y:Ljava/lang/Object;

    .line 64
    .line 65
    check-cast v8, Lw15;

    .line 66
    .line 67
    invoke-static {v8, v6}, Lu70;->L(Lw15;I)Lqs0;

    .line 68
    .line 69
    .line 70
    move-result-object v6

    .line 71
    iget-boolean v6, v6, Lqs0;->c:Z

    .line 72
    .line 73
    if-eqz v6, :cond_1

    .line 74
    .line 75
    iget-object v6, v2, Ljl1;->X:Ljava/lang/Object;

    .line 76
    .line 77
    check-cast v6, Lhl1;

    .line 78
    .line 79
    iget-object v6, v6, Lhl1;->g:Lpz2;

    .line 80
    .line 81
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 82
    .line 83
    .line 84
    :cond_1
    :goto_0
    invoke-virtual {v1}, Lnz5;->p()Z

    .line 85
    .line 86
    .line 87
    move-result v6

    .line 88
    const/4 v14, 0x0

    .line 89
    if-eqz v6, :cond_2

    .line 90
    .line 91
    iget-object v2, v0, Lfc8;->h0:Ljava/lang/Object;

    .line 92
    .line 93
    check-cast v2, Lvt1;

    .line 94
    .line 95
    iget v6, v1, Lnz5;->k0:I

    .line 96
    .line 97
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 98
    .line 99
    .line 100
    move-result-object v6

    .line 101
    invoke-virtual {v2, v6}, Lvt1;->B(Ljava/lang/Object;)Ljava/lang/Object;

    .line 102
    .line 103
    .line 104
    move-result-object v2

    .line 105
    check-cast v2, Lot0;

    .line 106
    .line 107
    if-nez v2, :cond_8

    .line 108
    .line 109
    iget v2, v1, Lnz5;->k0:I

    .line 110
    .line 111
    invoke-static {v0, v1, v2}, Lfc8;->j(Lfc8;Lnz5;I)Lsx4;

    .line 112
    .line 113
    .line 114
    move-result-object v2

    .line 115
    goto/16 :goto_2

    .line 116
    .line 117
    :cond_2
    iget v6, v1, Lnz5;->Z:I

    .line 118
    .line 119
    and-int/lit8 v8, v6, 0x20

    .line 120
    .line 121
    const/16 v10, 0x20

    .line 122
    .line 123
    if-ne v8, v10, :cond_3

    .line 124
    .line 125
    iget v2, v1, Lnz5;->l0:I

    .line 126
    .line 127
    invoke-virtual {v0, v2}, Lfc8;->d(I)Lhi8;

    .line 128
    .line 129
    .line 130
    move-result-object v2

    .line 131
    if-nez v2, :cond_8

    .line 132
    .line 133
    sget-object v2, Lu32;->a:Lu32;

    .line 134
    .line 135
    iget v2, v1, Lnz5;->l0:I

    .line 136
    .line 137
    invoke-static {v2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 138
    .line 139
    .line 140
    move-result-object v2

    .line 141
    iget-object v6, v0, Lfc8;->g0:Ljava/lang/Object;

    .line 142
    .line 143
    check-cast v6, Ljava/lang/String;

    .line 144
    .line 145
    filled-new-array {v2, v6}, [Ljava/lang/String;

    .line 146
    .line 147
    .line 148
    move-result-object v2

    .line 149
    sget-object v6, Ls32;->q0:Ls32;

    .line 150
    .line 151
    invoke-static {v6, v2}, Lu32;->d(Ls32;[Ljava/lang/String;)Lr32;

    .line 152
    .line 153
    .line 154
    move-result-object v2

    .line 155
    goto/16 :goto_3

    .line 156
    .line 157
    :cond_3
    and-int/lit8 v8, v6, 0x40

    .line 158
    .line 159
    const/16 v10, 0x40

    .line 160
    .line 161
    if-ne v8, v10, :cond_7

    .line 162
    .line 163
    iget-object v2, v2, Ljl1;->Y:Ljava/lang/Object;

    .line 164
    .line 165
    check-cast v2, Lw15;

    .line 166
    .line 167
    iget v6, v1, Lnz5;->m0:I

    .line 168
    .line 169
    invoke-interface {v2, v6}, Lw15;->getString(I)Ljava/lang/String;

    .line 170
    .line 171
    .line 172
    move-result-object v2

    .line 173
    invoke-virtual {v0}, Lfc8;->b()Ljava/util/List;

    .line 174
    .line 175
    .line 176
    move-result-object v6

    .line 177
    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 178
    .line 179
    .line 180
    move-result-object v6

    .line 181
    :cond_4
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 182
    .line 183
    .line 184
    move-result v7

    .line 185
    if-eqz v7, :cond_5

    .line 186
    .line 187
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 188
    .line 189
    .line 190
    move-result-object v7

    .line 191
    move-object v8, v7

    .line 192
    check-cast v8, Lhi8;

    .line 193
    .line 194
    invoke-interface {v8}, Led1;->getName()Lv15;

    .line 195
    .line 196
    .line 197
    move-result-object v8

    .line 198
    invoke-virtual {v8}, Lv15;->b()Ljava/lang/String;

    .line 199
    .line 200
    .line 201
    move-result-object v8

    .line 202
    invoke-static {v8, v2}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 203
    .line 204
    .line 205
    move-result v8

    .line 206
    if-eqz v8, :cond_4

    .line 207
    .line 208
    goto :goto_1

    .line 209
    :cond_5
    const/4 v7, 0x0

    .line 210
    :goto_1
    move-object v6, v7

    .line 211
    check-cast v6, Lhi8;

    .line 212
    .line 213
    if-nez v6, :cond_6

    .line 214
    .line 215
    sget-object v6, Lu32;->a:Lu32;

    .line 216
    .line 217
    invoke-virtual {v4}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 218
    .line 219
    .line 220
    move-result-object v6

    .line 221
    filled-new-array {v2, v6}, [Ljava/lang/String;

    .line 222
    .line 223
    .line 224
    move-result-object v2

    .line 225
    sget-object v6, Ls32;->r0:Ls32;

    .line 226
    .line 227
    invoke-static {v6, v2}, Lu32;->d(Ls32;[Ljava/lang/String;)Lr32;

    .line 228
    .line 229
    .line 230
    move-result-object v2

    .line 231
    goto :goto_3

    .line 232
    :cond_6
    move-object v2, v6

    .line 233
    goto :goto_2

    .line 234
    :cond_7
    and-int/lit16 v2, v6, 0x80

    .line 235
    .line 236
    if-ne v2, v7, :cond_9

    .line 237
    .line 238
    iget-object v2, v0, Lfc8;->i0:Ljava/lang/Object;

    .line 239
    .line 240
    check-cast v2, Lvt1;

    .line 241
    .line 242
    iget v6, v1, Lnz5;->n0:I

    .line 243
    .line 244
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 245
    .line 246
    .line 247
    move-result-object v6

    .line 248
    invoke-virtual {v2, v6}, Lvt1;->B(Ljava/lang/Object;)Ljava/lang/Object;

    .line 249
    .line 250
    .line 251
    move-result-object v2

    .line 252
    check-cast v2, Lot0;

    .line 253
    .line 254
    if-nez v2, :cond_8

    .line 255
    .line 256
    iget v2, v1, Lnz5;->n0:I

    .line 257
    .line 258
    invoke-static {v0, v1, v2}, Lfc8;->j(Lfc8;Lnz5;I)Lsx4;

    .line 259
    .line 260
    .line 261
    move-result-object v2

    .line 262
    :cond_8
    :goto_2
    invoke-interface {v2}, Lot0;->l()Llh8;

    .line 263
    .line 264
    .line 265
    move-result-object v2

    .line 266
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 267
    .line 268
    .line 269
    goto :goto_3

    .line 270
    :cond_9
    sget-object v2, Lu32;->a:Lu32;

    .line 271
    .line 272
    sget-object v2, Ls32;->t0:Ls32;

    .line 273
    .line 274
    new-array v6, v14, [Ljava/lang/String;

    .line 275
    .line 276
    invoke-static {v2, v6}, Lu32;->d(Ls32;[Ljava/lang/String;)Lr32;

    .line 277
    .line 278
    .line 279
    move-result-object v2

    .line 280
    :goto_3
    invoke-interface {v2}, Llh8;->x()Lot0;

    .line 281
    .line 282
    .line 283
    move-result-object v6

    .line 284
    invoke-static {v6}, Lu32;->f(Led1;)Z

    .line 285
    .line 286
    .line 287
    move-result v6

    .line 288
    const/4 v7, 0x1

    .line 289
    if-eqz v6, :cond_a

    .line 290
    .line 291
    sget-object v0, Lu32;->a:Lu32;

    .line 292
    .line 293
    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 294
    .line 295
    .line 296
    move-result-object v0

    .line 297
    filled-new-array {v0}, [Ljava/lang/String;

    .line 298
    .line 299
    .line 300
    move-result-object v0

    .line 301
    invoke-static {v0, v7}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 302
    .line 303
    .line 304
    move-result-object v0

    .line 305
    check-cast v0, [Ljava/lang/String;

    .line 306
    .line 307
    sget-object v1, Ls32;->y0:Ls32;

    .line 308
    .line 309
    sget-object v3, Ld02;->X:Ld02;

    .line 310
    .line 311
    invoke-static {v1, v3, v2, v0}, Lu32;->e(Ls32;Ljava/util/List;Llh8;[Ljava/lang/String;)Lq32;

    .line 312
    .line 313
    .line 314
    move-result-object v0

    .line 315
    return-object v0

    .line 316
    :cond_a
    new-instance v6, Lll1;

    .line 317
    .line 318
    iget-object v8, v5, Lhl1;->a:Lve4;

    .line 319
    .line 320
    new-instance v10, Lxg8;

    .line 321
    .line 322
    invoke-direct {v10, v0, v1, v7}, Lxg8;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 323
    .line 324
    .line 325
    invoke-direct {v6, v8, v10}, Lll1;-><init>(Lve4;Ldn2;)V

    .line 326
    .line 327
    .line 328
    iget-object v8, v5, Lhl1;->r:Ljava/util/List;

    .line 329
    .line 330
    invoke-static {v8, v6}, Lfc8;->h(Ljava/util/List;Lsm;)Lch8;

    .line 331
    .line 332
    .line 333
    move-result-object v8

    .line 334
    invoke-static {v1, v0}, Lfc8;->f(Lnz5;Lfc8;)Ljava/util/ArrayList;

    .line 335
    .line 336
    .line 337
    move-result-object v10

    .line 338
    new-instance v11, Ljava/util/ArrayList;

    .line 339
    .line 340
    const/16 v12, 0xa

    .line 341
    .line 342
    invoke-static {v10, v12}, Lxv0;->Z(Ljava/lang/Iterable;I)I

    .line 343
    .line 344
    .line 345
    move-result v13

    .line 346
    invoke-direct {v11, v13}, Ljava/util/ArrayList;-><init>(I)V

    .line 347
    .line 348
    .line 349
    invoke-virtual {v10}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 350
    .line 351
    .line 352
    move-result-object v10

    .line 353
    move v13, v14

    .line 354
    :goto_4
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    .line 355
    .line 356
    .line 357
    move-result v15

    .line 358
    const/16 v16, 0x0

    .line 359
    .line 360
    if-eqz v15, :cond_15

    .line 361
    .line 362
    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 363
    .line 364
    .line 365
    move-result-object v15

    .line 366
    add-int/lit8 v17, v13, 0x1

    .line 367
    .line 368
    if-ltz v13, :cond_14

    .line 369
    .line 370
    check-cast v15, Llz5;

    .line 371
    .line 372
    const/16 v18, 0x0

    .line 373
    .line 374
    invoke-interface {v2}, Llh8;->g()Ljava/util/List;

    .line 375
    .line 376
    .line 377
    move-result-object v9

    .line 378
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 379
    .line 380
    .line 381
    invoke-static {v13, v9}, Lwv0;->u0(ILjava/util/List;)Ljava/lang/Object;

    .line 382
    .line 383
    .line 384
    move-result-object v9

    .line 385
    check-cast v9, Lhi8;

    .line 386
    .line 387
    iget-object v13, v15, Llz5;->Z:Lkz5;

    .line 388
    .line 389
    sget-object v14, Lkz5;->g0:Lkz5;

    .line 390
    .line 391
    if-ne v13, v14, :cond_c

    .line 392
    .line 393
    if-nez v9, :cond_b

    .line 394
    .line 395
    new-instance v9, Lvg7;

    .line 396
    .line 397
    iget-object v13, v5, Lhl1;->b:Lvx4;

    .line 398
    .line 399
    invoke-interface {v13}, Lvx4;->f()Lzz3;

    .line 400
    .line 401
    .line 402
    move-result-object v13

    .line 403
    invoke-direct {v9, v13}, Lvg7;-><init>(Lzz3;)V

    .line 404
    .line 405
    .line 406
    goto :goto_8

    .line 407
    :cond_b
    new-instance v13, Lwg7;

    .line 408
    .line 409
    invoke-direct {v13, v9}, Lwg7;-><init>(Lhi8;)V

    .line 410
    .line 411
    .line 412
    :goto_5
    move-object v9, v13

    .line 413
    goto :goto_8

    .line 414
    :cond_c
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 415
    .line 416
    .line 417
    invoke-virtual {v13}, Ljava/lang/Enum;->ordinal()I

    .line 418
    .line 419
    .line 420
    move-result v9

    .line 421
    const/4 v14, 0x2

    .line 422
    if-eqz v9, :cond_10

    .line 423
    .line 424
    if-eq v9, v7, :cond_f

    .line 425
    .line 426
    if-eq v9, v14, :cond_e

    .line 427
    .line 428
    const/4 v0, 0x3

    .line 429
    if-eq v9, v0, :cond_d

    .line 430
    .line 431
    invoke-static {}, Lb61;->c()V

    .line 432
    .line 433
    .line 434
    return-object v16

    .line 435
    :cond_d
    const-string v0, "Only IN, OUT and INV are supported. Actual argument: "

    .line 436
    .line 437
    invoke-static {v13, v0}, Lu52;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 438
    .line 439
    .line 440
    return-object v16

    .line 441
    :cond_e
    sget-object v9, Lrt8;->Z:Lrt8;

    .line 442
    .line 443
    goto :goto_6

    .line 444
    :cond_f
    sget-object v9, Lrt8;->g0:Lrt8;

    .line 445
    .line 446
    goto :goto_6

    .line 447
    :cond_10
    sget-object v9, Lrt8;->f0:Lrt8;

    .line 448
    .line 449
    :goto_6
    iget v13, v15, Llz5;->Y:I

    .line 450
    .line 451
    and-int/lit8 v7, v13, 0x2

    .line 452
    .line 453
    if-ne v7, v14, :cond_11

    .line 454
    .line 455
    iget-object v7, v15, Llz5;->f0:Lnz5;

    .line 456
    .line 457
    goto :goto_7

    .line 458
    :cond_11
    and-int/lit8 v7, v13, 0x4

    .line 459
    .line 460
    const/4 v13, 0x4

    .line 461
    if-ne v7, v13, :cond_12

    .line 462
    .line 463
    iget v7, v15, Llz5;->g0:I

    .line 464
    .line 465
    invoke-virtual {v3, v7}, Lux4;->a(I)Lnz5;

    .line 466
    .line 467
    .line 468
    move-result-object v7

    .line 469
    goto :goto_7

    .line 470
    :cond_12
    move-object/from16 v7, v18

    .line 471
    .line 472
    :goto_7
    if-nez v7, :cond_13

    .line 473
    .line 474
    new-instance v9, Lwg7;

    .line 475
    .line 476
    invoke-virtual {v15}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 477
    .line 478
    .line 479
    move-result-object v7

    .line 480
    filled-new-array {v7}, [Ljava/lang/String;

    .line 481
    .line 482
    .line 483
    move-result-object v7

    .line 484
    sget-object v13, Ls32;->D0:Ls32;

    .line 485
    .line 486
    invoke-static {v13, v7}, Lu32;->c(Ls32;[Ljava/lang/String;)Lq32;

    .line 487
    .line 488
    .line 489
    move-result-object v7

    .line 490
    invoke-direct {v9, v7}, Lwg7;-><init>(Lt14;)V

    .line 491
    .line 492
    .line 493
    goto :goto_8

    .line 494
    :cond_13
    new-instance v13, Lwg7;

    .line 495
    .line 496
    invoke-virtual {v0, v7}, Lfc8;->i(Lnz5;)Lt14;

    .line 497
    .line 498
    .line 499
    move-result-object v7

    .line 500
    invoke-direct {v13, v7, v9}, Lwg7;-><init>(Lt14;Lrt8;)V

    .line 501
    .line 502
    .line 503
    goto :goto_5

    .line 504
    :goto_8
    invoke-virtual {v11, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 505
    .line 506
    .line 507
    move/from16 v13, v17

    .line 508
    .line 509
    const/4 v7, 0x1

    .line 510
    const/4 v14, 0x0

    .line 511
    goto/16 :goto_4

    .line 512
    .line 513
    :cond_14
    const/16 v18, 0x0

    .line 514
    .line 515
    invoke-static {}, Li21;->X()V

    .line 516
    .line 517
    .line 518
    throw v18

    .line 519
    :cond_15
    const/16 v18, 0x0

    .line 520
    .line 521
    invoke-static {v11}, Lwv0;->Y0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 522
    .line 523
    .line 524
    move-result-object v11

    .line 525
    invoke-interface {v2}, Llh8;->x()Lot0;

    .line 526
    .line 527
    .line 528
    move-result-object v7

    .line 529
    if-eqz p2, :cond_1a

    .line 530
    .line 531
    instance-of v9, v7, Lkm1;

    .line 532
    .line 533
    if-eqz v9, :cond_1a

    .line 534
    .line 535
    move-object v10, v7

    .line 536
    check-cast v10, Lkm1;

    .line 537
    .line 538
    new-instance v2, Lf08;

    .line 539
    .line 540
    const/4 v4, 0x6

    .line 541
    invoke-direct {v2, v4}, Lf08;-><init>(B)V

    .line 542
    .line 543
    .line 544
    iget-object v4, v10, Lkm1;->l0:Lg3;

    .line 545
    .line 546
    invoke-virtual {v4}, Lg3;->g()Ljava/util/List;

    .line 547
    .line 548
    .line 549
    move-result-object v4

    .line 550
    new-instance v7, Ljava/util/ArrayList;

    .line 551
    .line 552
    invoke-static {v4, v12}, Lxv0;->Z(Ljava/lang/Iterable;I)I

    .line 553
    .line 554
    .line 555
    move-result v8

    .line 556
    invoke-direct {v7, v8}, Ljava/util/ArrayList;-><init>(I)V

    .line 557
    .line 558
    .line 559
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 560
    .line 561
    .line 562
    move-result-object v4

    .line 563
    :goto_9
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 564
    .line 565
    .line 566
    move-result v8

    .line 567
    if-eqz v8, :cond_16

    .line 568
    .line 569
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 570
    .line 571
    .line 572
    move-result-object v8

    .line 573
    check-cast v8, Lhi8;

    .line 574
    .line 575
    invoke-interface {v8}, Lhi8;->a()Lhi8;

    .line 576
    .line 577
    .line 578
    move-result-object v8

    .line 579
    invoke-virtual {v7, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 580
    .line 581
    .line 582
    goto :goto_9

    .line 583
    :cond_16
    invoke-static {v7, v11}, Lwv0;->e1(Ljava/lang/Iterable;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    .line 584
    .line 585
    .line 586
    move-result-object v4

    .line 587
    invoke-static {v4}, Lzp4;->P(Ljava/util/List;)Ljava/util/Map;

    .line 588
    .line 589
    .line 590
    move-result-object v12

    .line 591
    new-instance v20, Lyr6;

    .line 592
    .line 593
    const/16 v13, 0x8

    .line 594
    .line 595
    move-object/from16 v9, v18

    .line 596
    .line 597
    move-object/from16 v8, v20

    .line 598
    .line 599
    invoke-direct/range {v8 .. v13}, Lyr6;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 600
    .line 601
    .line 602
    sget-object v4, Lch8;->Y:Lxd6;

    .line 603
    .line 604
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 605
    .line 606
    .line 607
    sget-object v21, Lch8;->Z:Lch8;

    .line 608
    .line 609
    invoke-virtual/range {v21 .. v21}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 610
    .line 611
    .line 612
    const/16 v23, 0x0

    .line 613
    .line 614
    const/16 v24, 0x1

    .line 615
    .line 616
    const/16 v22, 0x0

    .line 617
    .line 618
    move-object/from16 v19, v2

    .line 619
    .line 620
    invoke-virtual/range {v19 .. v24}, Lf08;->e(Lyr6;Lch8;ZIZ)Laa7;

    .line 621
    .line 622
    .line 623
    move-result-object v2

    .line 624
    iget-object v4, v5, Lhl1;->r:Ljava/util/List;

    .line 625
    .line 626
    invoke-virtual {v2}, Lt14;->getAnnotations()Lsm;

    .line 627
    .line 628
    .line 629
    move-result-object v5

    .line 630
    invoke-static {v6, v5}, Lwv0;->F0(Ljava/lang/Iterable;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    .line 631
    .line 632
    .line 633
    move-result-object v5

    .line 634
    invoke-virtual {v5}, Ljava/util/ArrayList;->isEmpty()Z

    .line 635
    .line 636
    .line 637
    move-result v6

    .line 638
    if-eqz v6, :cond_17

    .line 639
    .line 640
    sget-object v5, Loy1;->f0:Lrm;

    .line 641
    .line 642
    goto :goto_a

    .line 643
    :cond_17
    new-instance v6, Lvm;

    .line 644
    .line 645
    const/4 v7, 0x0

    .line 646
    invoke-direct {v6, v5, v7}, Lvm;-><init>(Ljava/lang/Object;B)V

    .line 647
    .line 648
    .line 649
    move-object v5, v6

    .line 650
    :goto_a
    invoke-static {v4, v5}, Lfc8;->h(Ljava/util/List;Lsm;)Lch8;

    .line 651
    .line 652
    .line 653
    move-result-object v4

    .line 654
    invoke-static {v2}, Lcj8;->e(Lt14;)Z

    .line 655
    .line 656
    .line 657
    move-result v5

    .line 658
    if-nez v5, :cond_19

    .line 659
    .line 660
    iget-boolean v5, v1, Lnz5;->g0:Z

    .line 661
    .line 662
    if-eqz v5, :cond_18

    .line 663
    .line 664
    goto :goto_b

    .line 665
    :cond_18
    const/4 v7, 0x0

    .line 666
    goto :goto_c

    .line 667
    :cond_19
    :goto_b
    const/4 v7, 0x1

    .line 668
    :goto_c
    invoke-virtual {v2, v7}, Laa7;->u0(Z)Laa7;

    .line 669
    .line 670
    .line 671
    move-result-object v2

    .line 672
    invoke-virtual {v2, v4}, Laa7;->v0(Lch8;)Laa7;

    .line 673
    .line 674
    .line 675
    move-result-object v2

    .line 676
    goto/16 :goto_14

    .line 677
    .line 678
    :cond_1a
    sget-object v5, Lmd2;->a:Ljd2;

    .line 679
    .line 680
    iget v6, v1, Lnz5;->s0:I

    .line 681
    .line 682
    invoke-virtual {v5, v6}, Ljd2;->l(I)Ljava/lang/Boolean;

    .line 683
    .line 684
    .line 685
    move-result-object v5

    .line 686
    invoke-virtual {v5}, Ljava/lang/Boolean;->booleanValue()Z

    .line 687
    .line 688
    .line 689
    move-result v5

    .line 690
    iget-boolean v6, v1, Lnz5;->g0:Z

    .line 691
    .line 692
    if-eqz v5, :cond_2a

    .line 693
    .line 694
    invoke-interface {v2}, Llh8;->g()Ljava/util/List;

    .line 695
    .line 696
    .line 697
    move-result-object v5

    .line 698
    invoke-interface {v5}, Ljava/util/List;->size()I

    .line 699
    .line 700
    .line 701
    move-result v5

    .line 702
    invoke-interface {v11}, Ljava/util/List;->size()I

    .line 703
    .line 704
    .line 705
    move-result v7

    .line 706
    sub-int/2addr v5, v7

    .line 707
    if-eqz v5, :cond_1d

    .line 708
    .line 709
    const/4 v7, 0x1

    .line 710
    if-eq v5, v7, :cond_1c

    .line 711
    .line 712
    :cond_1b
    :goto_d
    move-object/from16 v9, v18

    .line 713
    .line 714
    goto/16 :goto_13

    .line 715
    .line 716
    :cond_1c
    invoke-interface {v11}, Ljava/util/List;->size()I

    .line 717
    .line 718
    .line 719
    move-result v4

    .line 720
    sub-int/2addr v4, v7

    .line 721
    if-ltz v4, :cond_1b

    .line 722
    .line 723
    invoke-interface {v2}, Llh8;->f()Lzz3;

    .line 724
    .line 725
    .line 726
    move-result-object v5

    .line 727
    invoke-virtual {v5, v4}, Lzz3;->w(I)Lsx4;

    .line 728
    .line 729
    .line 730
    move-result-object v4

    .line 731
    invoke-interface {v4}, Lot0;->l()Llh8;

    .line 732
    .line 733
    .line 734
    move-result-object v4

    .line 735
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 736
    .line 737
    .line 738
    invoke-static {v8, v4, v11, v6}, Ldh3;->N(Lch8;Llh8;Ljava/util/List;Z)Laa7;

    .line 739
    .line 740
    .line 741
    move-result-object v9

    .line 742
    goto/16 :goto_13

    .line 743
    .line 744
    :cond_1d
    invoke-static {v8, v2, v11, v6}, Ldh3;->N(Lch8;Llh8;Ljava/util/List;Z)Laa7;

    .line 745
    .line 746
    .line 747
    move-result-object v9

    .line 748
    invoke-virtual {v9}, Lt14;->n0()Llh8;

    .line 749
    .line 750
    .line 751
    move-result-object v5

    .line 752
    invoke-interface {v5}, Llh8;->x()Lot0;

    .line 753
    .line 754
    .line 755
    move-result-object v5

    .line 756
    if-eqz v5, :cond_1f

    .line 757
    .line 758
    instance-of v6, v5, Lsx4;

    .line 759
    .line 760
    if-nez v6, :cond_1e

    .line 761
    .line 762
    goto :goto_e

    .line 763
    :cond_1e
    invoke-static {v5}, Lzz3;->K(Led1;)Z

    .line 764
    .line 765
    .line 766
    move-result v6

    .line 767
    if-nez v6, :cond_20

    .line 768
    .line 769
    :cond_1f
    :goto_e
    move-object/from16 v5, v18

    .line 770
    .line 771
    goto :goto_f

    .line 772
    :cond_20
    sget v6, Lel1;->a:I

    .line 773
    .line 774
    invoke-static {v5}, Lbl1;->f(Led1;)Lgk2;

    .line 775
    .line 776
    .line 777
    move-result-object v5

    .line 778
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 779
    .line 780
    .line 781
    invoke-static {v5}, Lw79;->x(Lgk2;)Lso2;

    .line 782
    .line 783
    .line 784
    move-result-object v5

    .line 785
    :goto_f
    sget-object v6, Loo2;->d:Loo2;

    .line 786
    .line 787
    invoke-static {v5, v6}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 788
    .line 789
    .line 790
    move-result v5

    .line 791
    if-nez v5, :cond_21

    .line 792
    .line 793
    goto :goto_d

    .line 794
    :cond_21
    invoke-static {v9}, Lw79;->C(Lt14;)Ljava/util/List;

    .line 795
    .line 796
    .line 797
    move-result-object v5

    .line 798
    invoke-static {v5}, Lwv0;->B0(Ljava/util/List;)Ljava/lang/Object;

    .line 799
    .line 800
    .line 801
    move-result-object v5

    .line 802
    check-cast v5, Lni8;

    .line 803
    .line 804
    if-eqz v5, :cond_1b

    .line 805
    .line 806
    invoke-virtual {v5}, Lni8;->b()Lt14;

    .line 807
    .line 808
    .line 809
    move-result-object v5

    .line 810
    if-nez v5, :cond_22

    .line 811
    .line 812
    goto :goto_d

    .line 813
    :cond_22
    invoke-virtual {v5}, Lt14;->n0()Llh8;

    .line 814
    .line 815
    .line 816
    move-result-object v6

    .line 817
    invoke-interface {v6}, Llh8;->x()Lot0;

    .line 818
    .line 819
    .line 820
    move-result-object v6

    .line 821
    if-eqz v6, :cond_23

    .line 822
    .line 823
    invoke-static {v6}, Lel1;->g(Led1;)Lfk2;

    .line 824
    .line 825
    .line 826
    move-result-object v6

    .line 827
    goto :goto_10

    .line 828
    :cond_23
    move-object/from16 v6, v18

    .line 829
    .line 830
    :goto_10
    invoke-virtual {v5}, Lt14;->l0()Ljava/util/List;

    .line 831
    .line 832
    .line 833
    move-result-object v7

    .line 834
    invoke-interface {v7}, Ljava/util/List;->size()I

    .line 835
    .line 836
    .line 837
    move-result v7

    .line 838
    const/4 v8, 0x1

    .line 839
    if-ne v7, v8, :cond_28

    .line 840
    .line 841
    sget-object v7, Lug7;->g:Lfk2;

    .line 842
    .line 843
    invoke-static {v6, v7}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 844
    .line 845
    .line 846
    move-result v7

    .line 847
    if-nez v7, :cond_24

    .line 848
    .line 849
    sget-object v7, Lqh8;->a:Lfk2;

    .line 850
    .line 851
    invoke-static {v6, v7}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 852
    .line 853
    .line 854
    move-result v6

    .line 855
    if-nez v6, :cond_24

    .line 856
    .line 857
    goto :goto_13

    .line 858
    :cond_24
    invoke-virtual {v5}, Lt14;->l0()Ljava/util/List;

    .line 859
    .line 860
    .line 861
    move-result-object v5

    .line 862
    invoke-static {v5}, Lwv0;->O0(Ljava/util/List;)Ljava/lang/Object;

    .line 863
    .line 864
    .line 865
    move-result-object v5

    .line 866
    check-cast v5, Lni8;

    .line 867
    .line 868
    invoke-virtual {v5}, Lni8;->b()Lt14;

    .line 869
    .line 870
    .line 871
    move-result-object v5

    .line 872
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 873
    .line 874
    .line 875
    instance-of v6, v4, Ljd0;

    .line 876
    .line 877
    if-eqz v6, :cond_25

    .line 878
    .line 879
    check-cast v4, Ljd0;

    .line 880
    .line 881
    goto :goto_11

    .line 882
    :cond_25
    move-object/from16 v4, v18

    .line 883
    .line 884
    :goto_11
    if-eqz v4, :cond_26

    .line 885
    .line 886
    invoke-static {v4}, Lel1;->c(Led1;)Lfk2;

    .line 887
    .line 888
    .line 889
    move-result-object v4

    .line 890
    goto :goto_12

    .line 891
    :cond_26
    move-object/from16 v4, v18

    .line 892
    .line 893
    :goto_12
    sget-object v6, Lsy7;->a:Lfk2;

    .line 894
    .line 895
    invoke-static {v4, v6}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 896
    .line 897
    .line 898
    move-result v4

    .line 899
    if-eqz v4, :cond_27

    .line 900
    .line 901
    invoke-static {v9, v5}, Lfc8;->a(Laa7;Lt14;)Laa7;

    .line 902
    .line 903
    .line 904
    move-result-object v9

    .line 905
    goto :goto_13

    .line 906
    :cond_27
    invoke-static {v9, v5}, Lfc8;->a(Laa7;Lt14;)Laa7;

    .line 907
    .line 908
    .line 909
    move-result-object v9

    .line 910
    :cond_28
    :goto_13
    if-nez v9, :cond_29

    .line 911
    .line 912
    sget-object v4, Lu32;->a:Lu32;

    .line 913
    .line 914
    sget-object v4, Ls32;->s0:Ls32;

    .line 915
    .line 916
    const/4 v7, 0x0

    .line 917
    new-array v5, v7, [Ljava/lang/String;

    .line 918
    .line 919
    invoke-static {v4, v11, v2, v5}, Lu32;->e(Ls32;Ljava/util/List;Llh8;[Ljava/lang/String;)Lq32;

    .line 920
    .line 921
    .line 922
    move-result-object v2

    .line 923
    goto :goto_14

    .line 924
    :cond_29
    move-object v2, v9

    .line 925
    goto :goto_14

    .line 926
    :cond_2a
    invoke-static {v8, v2, v11, v6}, Ldh3;->N(Lch8;Llh8;Ljava/util/List;Z)Laa7;

    .line 927
    .line 928
    .line 929
    move-result-object v2

    .line 930
    sget-object v4, Lmd2;->b:Ljd2;

    .line 931
    .line 932
    iget v5, v1, Lnz5;->s0:I

    .line 933
    .line 934
    invoke-virtual {v4, v5}, Ljd2;->l(I)Ljava/lang/Boolean;

    .line 935
    .line 936
    .line 937
    move-result-object v4

    .line 938
    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    .line 939
    .line 940
    .line 941
    move-result v4

    .line 942
    if-eqz v4, :cond_2c

    .line 943
    .line 944
    const/4 v7, 0x1

    .line 945
    invoke-static {v2, v7}, Lra;->j(Lmo8;Z)Lhh1;

    .line 946
    .line 947
    .line 948
    move-result-object v4

    .line 949
    if-eqz v4, :cond_2b

    .line 950
    .line 951
    move-object v2, v4

    .line 952
    goto :goto_14

    .line 953
    :cond_2b
    const-string v0, "null DefinitelyNotNullType for \'"

    .line 954
    .line 955
    invoke-static {v2, v0}, Lkp5;->s(Ljava/lang/Object;Ljava/lang/String;)V

    .line 956
    .line 957
    .line 958
    return-object v16

    .line 959
    :cond_2c
    :goto_14
    iget v4, v1, Lnz5;->Z:I

    .line 960
    .line 961
    and-int/lit16 v5, v4, 0x400

    .line 962
    .line 963
    const/16 v6, 0x400

    .line 964
    .line 965
    if-ne v5, v6, :cond_2d

    .line 966
    .line 967
    iget-object v9, v1, Lnz5;->q0:Lnz5;

    .line 968
    .line 969
    goto :goto_15

    .line 970
    :cond_2d
    const/16 v5, 0x800

    .line 971
    .line 972
    and-int/2addr v4, v5

    .line 973
    if-ne v4, v5, :cond_2e

    .line 974
    .line 975
    iget v1, v1, Lnz5;->r0:I

    .line 976
    .line 977
    invoke-virtual {v3, v1}, Lux4;->a(I)Lnz5;

    .line 978
    .line 979
    .line 980
    move-result-object v9

    .line 981
    goto :goto_15

    .line 982
    :cond_2e
    move-object/from16 v9, v18

    .line 983
    .line 984
    :goto_15
    if-eqz v9, :cond_2f

    .line 985
    .line 986
    const/4 v7, 0x0

    .line 987
    invoke-virtual {v0, v9, v7}, Lfc8;->e(Lnz5;Z)Laa7;

    .line 988
    .line 989
    .line 990
    move-result-object v0

    .line 991
    invoke-static {v2, v0}, Ljm4;->d0(Laa7;Laa7;)Laa7;

    .line 992
    .line 993
    .line 994
    move-result-object v0

    .line 995
    return-object v0

    .line 996
    :cond_2f
    return-object v2
.end method

.method public g(Lv15;Ljava/lang/Object;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lfc8;->Y:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lfu6;

    .line 4
    .line 5
    iget-object v0, v0, Lfu6;->f0:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v0, Lwx4;

    .line 8
    .line 9
    invoke-static {v0, p2}, Lpz2;->j(Lwx4;Ljava/lang/Object;)Ls21;

    .line 10
    .line 11
    .line 12
    move-result-object p2

    .line 13
    if-nez p2, :cond_0

    .line 14
    .line 15
    new-instance p2, Ljava/lang/StringBuilder;

    .line 16
    .line 17
    const-string v0, "Unsupported annotation argument: "

    .line 18
    .line 19
    invoke-direct {p2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object p2

    .line 29
    new-instance v0, Lv32;

    .line 30
    .line 31
    invoke-direct {v0, p2}, Lv32;-><init>(Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    move-object p2, v0

    .line 35
    :cond_0
    iget-object p0, p0, Lfc8;->Z:Ljava/lang/Object;

    .line 36
    .line 37
    check-cast p0, Ljava/util/HashMap;

    .line 38
    .line 39
    invoke-virtual {p0, p1, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    return-void
.end method

.method public getRoot()Landroid/view/View;
    .locals 0

    .line 1
    iget-object p0, p0, Lfc8;->Y:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Landroidx/cardview/widget/CardView;

    .line 4
    .line 5
    return-object p0
.end method

.method public i(Lnz5;)Lt14;
    .locals 8

    .line 1
    iget-object v0, p0, Lfc8;->Y:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljl1;

    .line 4
    .line 5
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    iget v1, p1, Lnz5;->Z:I

    .line 9
    .line 10
    const/4 v2, 0x2

    .line 11
    and-int/2addr v1, v2

    .line 12
    const/4 v3, 0x1

    .line 13
    if-ne v1, v2, :cond_2

    .line 14
    .line 15
    iget-object v1, v0, Ljl1;->Y:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast v1, Lw15;

    .line 18
    .line 19
    iget v2, p1, Lnz5;->h0:I

    .line 20
    .line 21
    invoke-interface {v1, v2}, Lw15;->getString(I)Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    invoke-virtual {p0, p1, v3}, Lfc8;->e(Lnz5;Z)Laa7;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    iget-object v4, v0, Ljl1;->f0:Ljava/lang/Object;

    .line 30
    .line 31
    check-cast v4, Lux4;

    .line 32
    .line 33
    iget v5, p1, Lnz5;->Z:I

    .line 34
    .line 35
    and-int/lit8 v6, v5, 0x4

    .line 36
    .line 37
    const/4 v7, 0x4

    .line 38
    if-ne v6, v7, :cond_0

    .line 39
    .line 40
    iget-object v4, p1, Lnz5;->i0:Lnz5;

    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_0
    const/16 v6, 0x8

    .line 44
    .line 45
    and-int/2addr v5, v6

    .line 46
    if-ne v5, v6, :cond_1

    .line 47
    .line 48
    iget v5, p1, Lnz5;->j0:I

    .line 49
    .line 50
    invoke-virtual {v4, v5}, Lux4;->a(I)Lnz5;

    .line 51
    .line 52
    .line 53
    move-result-object v4

    .line 54
    goto :goto_0

    .line 55
    :cond_1
    const/4 v4, 0x0

    .line 56
    :goto_0
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 57
    .line 58
    .line 59
    invoke-virtual {p0, v4, v3}, Lfc8;->e(Lnz5;Z)Laa7;

    .line 60
    .line 61
    .line 62
    move-result-object p0

    .line 63
    iget-object v0, v0, Ljl1;->X:Ljava/lang/Object;

    .line 64
    .line 65
    check-cast v0, Lhl1;

    .line 66
    .line 67
    iget-object v0, v0, Lhl1;->j:Lde2;

    .line 68
    .line 69
    invoke-interface {v0, p1, v1, v2, p0}, Lde2;->b(Lnz5;Ljava/lang/String;Laa7;Laa7;)Lt14;

    .line 70
    .line 71
    .line 72
    move-result-object p0

    .line 73
    return-object p0

    .line 74
    :cond_2
    invoke-virtual {p0, p1, v3}, Lfc8;->e(Lnz5;Z)Laa7;

    .line 75
    .line 76
    .line 77
    move-result-object p0

    .line 78
    return-object p0
.end method

.method public n(Lv15;Lvs0;)V
    .locals 2

    .line 1
    new-instance v0, Lkv3;

    .line 2
    .line 3
    new-instance v1, Liv3;

    .line 4
    .line 5
    invoke-direct {v1, p2}, Liv3;-><init>(Lvs0;)V

    .line 6
    .line 7
    .line 8
    invoke-direct {v0, v1}, Ls21;-><init>(Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    iget-object p0, p0, Lfc8;->Z:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast p0, Ljava/util/HashMap;

    .line 14
    .line 15
    invoke-virtual {p0, p1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    return-void
.end method

.method public r(Lv15;)Lj04;
    .locals 2

    .line 1
    new-instance v0, Lz47;

    .line 2
    .line 3
    iget-object v1, p0, Lfc8;->Y:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v1, Lfu6;

    .line 6
    .line 7
    invoke-direct {v0, v1, p1, p0}, Lz47;-><init>(Lfu6;Lv15;Lfc8;)V

    .line 8
    .line 9
    .line 10
    return-object v0
.end method

.method public t(Lv15;Lqs0;Lv15;)V
    .locals 1

    .line 1
    new-instance v0, Lx22;

    .line 2
    .line 3
    invoke-direct {v0, p2, p3}, Lx22;-><init>(Lqs0;Lv15;)V

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, Lfc8;->Z:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast p0, Ljava/util/HashMap;

    .line 9
    .line 10
    invoke-virtual {p0, p1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 1
    iget-byte v0, p0, Lfc8;->X:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-super {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0

    .line 11
    :pswitch_0
    iget-object v0, p0, Lfc8;->f0:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v0, Ljava/lang/String;

    .line 14
    .line 15
    iget-object p0, p0, Lfc8;->Z:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast p0, Lfc8;

    .line 18
    .line 19
    if-nez p0, :cond_0

    .line 20
    .line 21
    const-string p0, ""

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    iget-object p0, p0, Lfc8;->f0:Ljava/lang/Object;

    .line 25
    .line 26
    check-cast p0, Ljava/lang/String;

    .line 27
    .line 28
    const-string v1, ". Child of "

    .line 29
    .line 30
    invoke-virtual {v1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    :goto_0
    invoke-virtual {v0, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    return-object p0

    .line 39
    :pswitch_data_0
    .packed-switch 0x4
        :pswitch_0
    .end packed-switch
.end method

.method public w(Lqs0;Lv15;)Li04;
    .locals 3

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Lfc8;->Y:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v1, Lfu6;

    .line 9
    .line 10
    sget-object v2, Lke7;->G:Lg55;

    .line 11
    .line 12
    invoke-virtual {v1, p1, v2, v0}, Lfu6;->a0(Lqs0;Lke7;Ljava/util/List;)Lfc8;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    new-instance v1, Ly5;

    .line 17
    .line 18
    invoke-direct {v1, p1, p0, p2, v0}, Ly5;-><init>(Lfc8;Lfc8;Lv15;Ljava/util/ArrayList;)V

    .line 19
    .line 20
    .line 21
    return-object v1
.end method
