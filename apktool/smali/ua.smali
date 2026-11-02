.class public final Lua;
.super Lwz;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lu07;
.implements Lch2;


# instance fields
.field public final X:Lmo5;

.field public final Y:Lb17;

.field public final Z:Landroidx/compose/ui/platform/AndroidComposeView;

.field public final f0:Lu86;

.field public final g0:Ljava/lang/String;

.field public final h0:Landroid/graphics/Rect;

.field public final i0:Landroid/view/autofill/AutofillId;

.field public final j0:Lwz4;

.field public k0:Z


# direct methods
.method public constructor <init>(Lmo5;Lb17;Landroidx/compose/ui/platform/AndroidComposeView;Lu86;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lua;->X:Lmo5;

    .line 5
    .line 6
    iput-object p2, p0, Lua;->Y:Lb17;

    .line 7
    .line 8
    iput-object p3, p0, Lua;->Z:Landroidx/compose/ui/platform/AndroidComposeView;

    .line 9
    .line 10
    iput-object p4, p0, Lua;->f0:Lu86;

    .line 11
    .line 12
    iput-object p5, p0, Lua;->g0:Ljava/lang/String;

    .line 13
    .line 14
    new-instance p1, Landroid/graphics/Rect;

    .line 15
    .line 16
    invoke-direct {p1}, Landroid/graphics/Rect;-><init>()V

    .line 17
    .line 18
    .line 19
    iput-object p1, p0, Lua;->h0:Landroid/graphics/Rect;

    .line 20
    .line 21
    const/4 p1, 0x1

    .line 22
    invoke-virtual {p3, p1}, Landroid/view/View;->setImportantForAutofill(I)V

    .line 23
    .line 24
    .line 25
    invoke-static {p3}, Lmn7;->e(Landroid/view/View;)Lvz;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    if-eqz p1, :cond_0

    .line 30
    .line 31
    iget-object p1, p1, Lvz;->a:Ljava/lang/Object;

    .line 32
    .line 33
    check-cast p1, Landroid/view/autofill/AutofillId;

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_0
    const/4 p1, 0x0

    .line 37
    :goto_0
    if-eqz p1, :cond_1

    .line 38
    .line 39
    iput-object p1, p0, Lua;->i0:Landroid/view/autofill/AutofillId;

    .line 40
    .line 41
    new-instance p1, Lwz4;

    .line 42
    .line 43
    invoke-direct {p1}, Lwz4;-><init>()V

    .line 44
    .line 45
    .line 46
    iput-object p1, p0, Lua;->j0:Lwz4;

    .line 47
    .line 48
    return-void

    .line 49
    :cond_1
    const-string p0, "Required value was null."

    .line 50
    .line 51
    invoke-static {p0}, Lp61;->j(Ljava/lang/String;)Lo14;

    .line 52
    .line 53
    .line 54
    move-result-object p0

    .line 55
    throw p0
.end method


# virtual methods
.method public final a(Lai2;Lai2;)V
    .locals 9

    .line 1
    iget-object v0, p0, Lua;->Z:Landroidx/compose/ui/platform/AndroidComposeView;

    .line 2
    .line 3
    iget-object v1, p0, Lua;->X:Lmo5;

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    if-eqz p1, :cond_0

    .line 7
    .line 8
    invoke-static {p1}, Lyn0;->Z(Lnh1;)Landroidx/compose/ui/node/LayoutNode;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    if-eqz p1, :cond_0

    .line 13
    .line 14
    invoke-virtual {p1}, Landroidx/compose/ui/node/LayoutNode;->y()Lt07;

    .line 15
    .line 16
    .line 17
    move-result-object v3

    .line 18
    if-eqz v3, :cond_0

    .line 19
    .line 20
    invoke-static {v3}, Lz91;->I(Lt07;)Z

    .line 21
    .line 22
    .line 23
    move-result v3

    .line 24
    if-ne v3, v2, :cond_0

    .line 25
    .line 26
    iget p1, p1, Landroidx/compose/ui/node/LayoutNode;->Y:I

    .line 27
    .line 28
    invoke-virtual {v1, v0, p1}, Lmo5;->e(Landroidx/compose/ui/platform/AndroidComposeView;I)V

    .line 29
    .line 30
    .line 31
    :cond_0
    if-eqz p2, :cond_1

    .line 32
    .line 33
    invoke-static {p2}, Lyn0;->Z(Lnh1;)Landroidx/compose/ui/node/LayoutNode;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    if-eqz p1, :cond_1

    .line 38
    .line 39
    invoke-virtual {p1}, Landroidx/compose/ui/node/LayoutNode;->y()Lt07;

    .line 40
    .line 41
    .line 42
    move-result-object p2

    .line 43
    if-eqz p2, :cond_1

    .line 44
    .line 45
    invoke-static {p2}, Lz91;->I(Lt07;)Z

    .line 46
    .line 47
    .line 48
    move-result p2

    .line 49
    if-ne p2, v2, :cond_1

    .line 50
    .line 51
    iget p1, p1, Landroidx/compose/ui/node/LayoutNode;->Y:I

    .line 52
    .line 53
    iget-object p0, p0, Lua;->f0:Lu86;

    .line 54
    .line 55
    iget-object p2, p0, Lu86;->a:Lff3;

    .line 56
    .line 57
    invoke-virtual {p2, p1}, Lff3;->b(I)Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object p2

    .line 61
    check-cast p2, Landroidx/compose/ui/node/LayoutNode;

    .line 62
    .line 63
    if-eqz p2, :cond_1

    .line 64
    .line 65
    iget v3, p2, Landroidx/compose/ui/node/LayoutNode;->i0:I

    .line 66
    .line 67
    const/4 v4, -0x4

    .line 68
    if-eq v3, v4, :cond_1

    .line 69
    .line 70
    iget-object v3, p0, Lu86;->c:Lne;

    .line 71
    .line 72
    invoke-virtual {p0, p2}, Lu86;->d(Landroidx/compose/ui/node/LayoutNode;)I

    .line 73
    .line 74
    .line 75
    move-result p0

    .line 76
    iget-object p2, v3, Lne;->c:Ljava/lang/Object;

    .line 77
    .line 78
    check-cast p2, [J

    .line 79
    .line 80
    aget-wide v3, p2, p0

    .line 81
    .line 82
    add-int/2addr p0, v2

    .line 83
    aget-wide v5, p2, p0

    .line 84
    .line 85
    const/16 p0, 0x20

    .line 86
    .line 87
    shr-long v7, v3, p0

    .line 88
    .line 89
    long-to-int p2, v7

    .line 90
    long-to-int v2, v3

    .line 91
    shr-long v3, v5, p0

    .line 92
    .line 93
    long-to-int p0, v3

    .line 94
    long-to-int v3, v5

    .line 95
    new-instance v4, Landroid/graphics/Rect;

    .line 96
    .line 97
    invoke-direct {v4, p2, v2, p0, v3}, Landroid/graphics/Rect;-><init>(IIII)V

    .line 98
    .line 99
    .line 100
    invoke-virtual {v1, v0, p1, v4}, Lmo5;->d(Landroidx/compose/ui/platform/AndroidComposeView;ILandroid/graphics/Rect;)V

    .line 101
    .line 102
    .line 103
    :cond_1
    return-void
.end method

.method public final b(Landroid/util/SparseArray;)V
    .locals 8

    .line 1
    invoke-virtual {p1}, Landroid/util/SparseArray;->size()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    :goto_0
    if-ge v1, v0, :cond_4

    .line 7
    .line 8
    invoke-virtual {p1, v1}, Landroid/util/SparseArray;->keyAt(I)I

    .line 9
    .line 10
    .line 11
    move-result v2

    .line 12
    invoke-virtual {p1, v2}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v3

    .line 16
    invoke-static {v3}, Lc42;->a(Ljava/lang/Object;)Landroid/view/autofill/AutofillValue;

    .line 17
    .line 18
    .line 19
    move-result-object v3

    .line 20
    iget-object v4, p0, Lua;->Y:Lb17;

    .line 21
    .line 22
    iget-object v4, v4, Lb17;->c:Lff3;

    .line 23
    .line 24
    invoke-virtual {v4, v2}, Lff3;->b(I)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    check-cast v2, Landroidx/compose/ui/node/LayoutNode;

    .line 29
    .line 30
    if-eqz v2, :cond_3

    .line 31
    .line 32
    invoke-virtual {v2}, Landroidx/compose/ui/node/LayoutNode;->y()Lt07;

    .line 33
    .line 34
    .line 35
    move-result-object v2

    .line 36
    if-eqz v2, :cond_3

    .line 37
    .line 38
    iget-object v2, v2, Lt07;->X:Ls05;

    .line 39
    .line 40
    sget-object v4, Ls07;->g:Le17;

    .line 41
    .line 42
    invoke-virtual {v2, v4}, Ls05;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object v4

    .line 46
    const/4 v5, 0x0

    .line 47
    if-nez v4, :cond_0

    .line 48
    .line 49
    move-object v4, v5

    .line 50
    :cond_0
    check-cast v4, Lq3;

    .line 51
    .line 52
    if-eqz v4, :cond_1

    .line 53
    .line 54
    iget-object v4, v4, Lq3;->b:Lon2;

    .line 55
    .line 56
    check-cast v4, Lgn2;

    .line 57
    .line 58
    if-eqz v4, :cond_1

    .line 59
    .line 60
    new-instance v6, Lql;

    .line 61
    .line 62
    invoke-virtual {v3}, Landroid/view/autofill/AutofillValue;->getTextValue()Ljava/lang/CharSequence;

    .line 63
    .line 64
    .line 65
    move-result-object v7

    .line 66
    invoke-virtual {v7}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object v7

    .line 70
    invoke-direct {v6, v7}, Lql;-><init>(Ljava/lang/String;)V

    .line 71
    .line 72
    .line 73
    invoke-interface {v4, v6}, Lgn2;->B(Ljava/lang/Object;)Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    move-result-object v4

    .line 77
    check-cast v4, Ljava/lang/Boolean;

    .line 78
    .line 79
    :cond_1
    sget-object v4, Ls07;->h:Le17;

    .line 80
    .line 81
    invoke-virtual {v2, v4}, Ls05;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object v2

    .line 85
    if-nez v2, :cond_2

    .line 86
    .line 87
    goto :goto_1

    .line 88
    :cond_2
    move-object v5, v2

    .line 89
    :goto_1
    check-cast v5, Lq3;

    .line 90
    .line 91
    if-eqz v5, :cond_3

    .line 92
    .line 93
    iget-object v2, v5, Lq3;->b:Lon2;

    .line 94
    .line 95
    check-cast v2, Lgn2;

    .line 96
    .line 97
    if-eqz v2, :cond_3

    .line 98
    .line 99
    new-instance v4, Lyd;

    .line 100
    .line 101
    invoke-direct {v4, v3}, Lyd;-><init>(Landroid/view/autofill/AutofillValue;)V

    .line 102
    .line 103
    .line 104
    invoke-interface {v2, v4}, Lgn2;->B(Ljava/lang/Object;)Ljava/lang/Object;

    .line 105
    .line 106
    .line 107
    move-result-object v2

    .line 108
    check-cast v2, Ljava/lang/Boolean;

    .line 109
    .line 110
    :cond_3
    add-int/lit8 v1, v1, 0x1

    .line 111
    .line 112
    goto :goto_0

    .line 113
    :cond_4
    return-void
.end method
