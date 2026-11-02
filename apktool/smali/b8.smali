.class public final Lb8;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# instance fields
.field public final synthetic a:B

.field public b:I

.field public c:Ljava/lang/Object;


# direct methods
.method public constructor <init>()V
    .locals 1

    const/16 v0, 0xa

    iput-byte v0, p0, Lb8;->a:B

    .line 44
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 45
    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object v0, p0, Lb8;->c:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(B)V
    .locals 0

    .line 53
    iput-byte p1, p0, Lb8;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(BI)V
    .locals 0

    .line 41
    iput-byte p1, p0, Lb8;->a:B

    iput p2, p0, Lb8;->b:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const/4 v0, 0x0

    iput-byte v0, p0, Lb8;->a:B

    .line 52
    invoke-static {p1, v0}, Lc8;->j(Landroid/content/Context;I)I

    move-result v0

    invoke-direct {p0, p1, v0}, Lb8;-><init>(Landroid/content/Context;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;I)V
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-byte v0, p0, Lb8;->a:B

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    new-instance v0, Lx7;

    .line 8
    .line 9
    new-instance v1, Landroid/view/ContextThemeWrapper;

    .line 10
    .line 11
    invoke-static {p1, p2}, Lc8;->j(Landroid/content/Context;I)I

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    invoke-direct {v1, p1, v2}, Landroid/view/ContextThemeWrapper;-><init>(Landroid/content/Context;I)V

    .line 16
    .line 17
    .line 18
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 19
    .line 20
    .line 21
    const/4 p1, -0x1

    .line 22
    iput p1, v0, Lx7;->a:I

    .line 23
    .line 24
    iput-object v1, v0, Lx7;->c:Ljava/lang/Object;

    .line 25
    .line 26
    const-string p1, "layout_inflater"

    .line 27
    .line 28
    invoke-virtual {v1, p1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    check-cast p1, Landroid/view/LayoutInflater;

    .line 33
    .line 34
    iput-object p1, v0, Lx7;->d:Ljava/lang/Object;

    .line 35
    .line 36
    iput-object v0, p0, Lb8;->c:Ljava/lang/Object;

    .line 37
    .line 38
    iput p2, p0, Lb8;->b:I

    .line 39
    .line 40
    return-void
.end method

.method public constructor <init>(Lby0;I)V
    .locals 1

    const/16 v0, 0xb

    iput-byte v0, p0, Lb8;->a:B

    .line 49
    iput-object p1, p0, Lb8;->c:Ljava/lang/Object;

    .line 50
    invoke-direct {p0, v0, p2}, Lb8;-><init>(BI)V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;IB)V
    .locals 0

    .line 42
    iput-byte p3, p0, Lb8;->a:B

    iput-object p1, p0, Lb8;->c:Ljava/lang/Object;

    iput p2, p0, Lb8;->b:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Ljava/util/ArrayList;)V
    .locals 1

    const/16 v0, 0xc

    iput-byte v0, p0, Lb8;->a:B

    .line 51
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lb8;->c:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lpj0;)V
    .locals 1

    const/16 v0, 0xd

    iput-byte v0, p0, Lb8;->a:B

    .line 46
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 47
    iput-object p1, p0, Lb8;->c:Ljava/lang/Object;

    .line 48
    invoke-static {}, Ljava/lang/Runtime;->getRuntime()Ljava/lang/Runtime;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Runtime;->availableProcessors()I

    move-result p1

    add-int/lit8 p1, p1, -0x2

    const/4 v0, 0x4

    invoke-static {v0, p1}, Ljava/lang/Math;->max(II)I

    move-result p1

    iput p1, p0, Lb8;->b:I

    return-void
.end method

.method public constructor <init>(Lx11;I)V
    .locals 1

    const/16 v0, 0x11

    iput-byte v0, p0, Lb8;->a:B

    .line 43
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Lw45;->s(Ljava/lang/Object;)V

    iput-object p1, p0, Lb8;->c:Ljava/lang/Object;

    iput p2, p0, Lb8;->b:I

    return-void
.end method

.method public static e(Ljava/lang/String;)V
    .locals 7

    .line 1
    const-string v0, ":memory:"

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_7

    .line 8
    .line 9
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    const/4 v1, 0x1

    .line 14
    sub-int/2addr v0, v1

    .line 15
    const/4 v2, 0x0

    .line 16
    move v3, v2

    .line 17
    move v4, v3

    .line 18
    :goto_0
    if-gt v3, v0, :cond_5

    .line 19
    .line 20
    if-nez v4, :cond_0

    .line 21
    .line 22
    move v5, v3

    .line 23
    goto :goto_1

    .line 24
    :cond_0
    move v5, v0

    .line 25
    :goto_1
    invoke-virtual {p0, v5}, Ljava/lang/String;->charAt(I)C

    .line 26
    .line 27
    .line 28
    move-result v5

    .line 29
    const/16 v6, 0x20

    .line 30
    .line 31
    invoke-static {v5, v6}, Ldh3;->k(II)I

    .line 32
    .line 33
    .line 34
    move-result v5

    .line 35
    if-gtz v5, :cond_1

    .line 36
    .line 37
    move v5, v1

    .line 38
    goto :goto_2

    .line 39
    :cond_1
    move v5, v2

    .line 40
    :goto_2
    if-nez v4, :cond_3

    .line 41
    .line 42
    if-nez v5, :cond_2

    .line 43
    .line 44
    move v4, v1

    .line 45
    goto :goto_0

    .line 46
    :cond_2
    add-int/lit8 v3, v3, 0x1

    .line 47
    .line 48
    goto :goto_0

    .line 49
    :cond_3
    if-nez v5, :cond_4

    .line 50
    .line 51
    goto :goto_3

    .line 52
    :cond_4
    add-int/lit8 v0, v0, -0x1

    .line 53
    .line 54
    goto :goto_0

    .line 55
    :cond_5
    :goto_3
    add-int/2addr v0, v1

    .line 56
    invoke-virtual {p0, v3, v0}, Ljava/lang/String;->subSequence(II)Ljava/lang/CharSequence;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 65
    .line 66
    .line 67
    move-result v0

    .line 68
    if-nez v0, :cond_6

    .line 69
    .line 70
    goto :goto_4

    .line 71
    :cond_6
    :try_start_0
    new-instance v0, Ljava/io/File;

    .line 72
    .line 73
    invoke-direct {v0, p0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 74
    .line 75
    .line 76
    invoke-static {v0}, Landroid/database/sqlite/SQLiteDatabase;->deleteDatabase(Ljava/io/File;)Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 77
    .line 78
    .line 79
    :catch_0
    :cond_7
    :goto_4
    return-void
.end method


# virtual methods
.method public a(J)V
    .locals 4

    .line 1
    invoke-virtual {p0, p1, p2}, Lb8;->c(J)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_1

    .line 6
    .line 7
    iget v0, p0, Lb8;->b:I

    .line 8
    .line 9
    iget-object v1, p0, Lb8;->c:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v1, [J

    .line 12
    .line 13
    array-length v2, v1

    .line 14
    if-lt v0, v2, :cond_0

    .line 15
    .line 16
    add-int/lit8 v2, v0, 0x1

    .line 17
    .line 18
    array-length v3, v1

    .line 19
    mul-int/lit8 v3, v3, 0x2

    .line 20
    .line 21
    invoke-static {v2, v3}, Ljava/lang/Math;->max(II)I

    .line 22
    .line 23
    .line 24
    move-result v2

    .line 25
    invoke-static {v1, v2}, Ljava/util/Arrays;->copyOf([JI)[J

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    iput-object v1, p0, Lb8;->c:Ljava/lang/Object;

    .line 30
    .line 31
    :cond_0
    aput-wide p1, v1, v0

    .line 32
    .line 33
    iget p1, p0, Lb8;->b:I

    .line 34
    .line 35
    if-lt v0, p1, :cond_1

    .line 36
    .line 37
    add-int/lit8 v0, v0, 0x1

    .line 38
    .line 39
    iput v0, p0, Lb8;->b:I

    .line 40
    .line 41
    :cond_1
    return-void
.end method

.method public b()V
    .locals 7

    .line 1
    iget v0, p0, Lb8;->b:I

    .line 2
    .line 3
    add-int/lit8 v1, v0, 0x1

    .line 4
    .line 5
    iput v1, p0, Lb8;->b:I

    .line 6
    .line 7
    const/16 v1, 0xa

    .line 8
    .line 9
    if-lt v0, v1, :cond_5

    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    iput v0, p0, Lb8;->b:I

    .line 13
    .line 14
    iget-object p0, p0, Lb8;->c:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast p0, Ljava/util/LinkedHashMap;

    .line 17
    .line 18
    invoke-virtual {p0}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    invoke-interface {p0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    :cond_0
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    if-eqz v1, :cond_5

    .line 31
    .line 32
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    check-cast v1, Ljava/util/ArrayList;

    .line 37
    .line 38
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 39
    .line 40
    .line 41
    move-result v2

    .line 42
    const/4 v3, 0x1

    .line 43
    if-gt v2, v3, :cond_2

    .line 44
    .line 45
    invoke-static {v1}, Lwv0;->t0(Ljava/util/List;)Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    check-cast v1, Lg86;

    .line 50
    .line 51
    if-eqz v1, :cond_1

    .line 52
    .line 53
    iget-object v1, v1, Lg86;->a:Ljava/lang/ref/WeakReference;

    .line 54
    .line 55
    invoke-virtual {v1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object v1

    .line 59
    check-cast v1, Ld53;

    .line 60
    .line 61
    goto :goto_1

    .line 62
    :cond_1
    const/4 v1, 0x0

    .line 63
    :goto_1
    if-nez v1, :cond_0

    .line 64
    .line 65
    invoke-interface {p0}, Ljava/util/Iterator;->remove()V

    .line 66
    .line 67
    .line 68
    goto :goto_0

    .line 69
    :cond_2
    invoke-interface {v1}, Ljava/util/Collection;->size()I

    .line 70
    .line 71
    .line 72
    move-result v2

    .line 73
    move v3, v0

    .line 74
    move v4, v3

    .line 75
    :goto_2
    if-ge v3, v2, :cond_4

    .line 76
    .line 77
    sub-int v5, v3, v4

    .line 78
    .line 79
    invoke-interface {v1, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    move-result-object v6

    .line 83
    check-cast v6, Lg86;

    .line 84
    .line 85
    iget-object v6, v6, Lg86;->a:Ljava/lang/ref/WeakReference;

    .line 86
    .line 87
    invoke-virtual {v6}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    move-result-object v6

    .line 91
    if-nez v6, :cond_3

    .line 92
    .line 93
    invoke-interface {v1, v5}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    add-int/lit8 v4, v4, 0x1

    .line 97
    .line 98
    :cond_3
    add-int/lit8 v3, v3, 0x1

    .line 99
    .line 100
    goto :goto_2

    .line 101
    :cond_4
    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    .line 102
    .line 103
    .line 104
    move-result v1

    .line 105
    if-eqz v1, :cond_0

    .line 106
    .line 107
    invoke-interface {p0}, Ljava/util/Iterator;->remove()V

    .line 108
    .line 109
    .line 110
    goto :goto_0

    .line 111
    :cond_5
    return-void
.end method

.method public c(J)Z
    .locals 6

    .line 1
    iget v0, p0, Lb8;->b:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    move v2, v1

    .line 5
    :goto_0
    if-ge v2, v0, :cond_1

    .line 6
    .line 7
    iget-object v3, p0, Lb8;->c:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v3, [J

    .line 10
    .line 11
    aget-wide v4, v3, v2

    .line 12
    .line 13
    cmp-long v3, v4, p1

    .line 14
    .line 15
    if-nez v3, :cond_0

    .line 16
    .line 17
    const/4 p0, 0x1

    .line 18
    return p0

    .line 19
    :cond_0
    add-int/lit8 v2, v2, 0x1

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_1
    return v1
.end method

.method public d()Lc8;
    .locals 10

    .line 1
    new-instance v0, Lc8;

    .line 2
    .line 3
    iget-object v1, p0, Lb8;->c:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v1, Lx7;

    .line 6
    .line 7
    iget-object v2, v1, Lx7;->c:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v2, Landroid/view/ContextThemeWrapper;

    .line 10
    .line 11
    iget p0, p0, Lb8;->b:I

    .line 12
    .line 13
    invoke-direct {v0, v2, p0}, Lc8;-><init>(Landroid/view/ContextThemeWrapper;I)V

    .line 14
    .line 15
    .line 16
    iget-object p0, v1, Lx7;->g:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast p0, Landroid/view/View;

    .line 19
    .line 20
    iget-object v2, v0, Lc8;->i0:La8;

    .line 21
    .line 22
    const/4 v3, 0x0

    .line 23
    if-eqz p0, :cond_0

    .line 24
    .line 25
    iput-object p0, v2, La8;->p:Landroid/view/View;

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    iget-object p0, v1, Lx7;->f:Ljava/lang/Object;

    .line 29
    .line 30
    check-cast p0, Ljava/lang/CharSequence;

    .line 31
    .line 32
    if-eqz p0, :cond_2

    .line 33
    .line 34
    iput-object p0, v2, La8;->d:Ljava/lang/CharSequence;

    .line 35
    .line 36
    iget-object v4, v2, La8;->n:Landroid/widget/TextView;

    .line 37
    .line 38
    if-eqz v4, :cond_1

    .line 39
    .line 40
    invoke-virtual {v4, p0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 41
    .line 42
    .line 43
    :cond_1
    iget-object v4, v2, La8;->c:Landroid/view/Window;

    .line 44
    .line 45
    invoke-virtual {v4, p0}, Landroid/view/Window;->setTitle(Ljava/lang/CharSequence;)V

    .line 46
    .line 47
    .line 48
    :cond_2
    iget-object p0, v1, Lx7;->e:Ljava/lang/Object;

    .line 49
    .line 50
    check-cast p0, Landroid/graphics/drawable/Drawable;

    .line 51
    .line 52
    if-eqz p0, :cond_3

    .line 53
    .line 54
    iput-object p0, v2, La8;->l:Landroid/graphics/drawable/Drawable;

    .line 55
    .line 56
    iget-object v4, v2, La8;->m:Landroid/widget/ImageView;

    .line 57
    .line 58
    if-eqz v4, :cond_3

    .line 59
    .line 60
    invoke-virtual {v4, v3}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 61
    .line 62
    .line 63
    iget-object v4, v2, La8;->m:Landroid/widget/ImageView;

    .line 64
    .line 65
    invoke-virtual {v4, p0}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 66
    .line 67
    .line 68
    :cond_3
    :goto_0
    iget-object p0, v1, Lx7;->j:Ljava/lang/Object;

    .line 69
    .line 70
    check-cast p0, Landroid/widget/ListAdapter;

    .line 71
    .line 72
    const/4 v4, 0x1

    .line 73
    const/4 v5, 0x0

    .line 74
    if-eqz p0, :cond_8

    .line 75
    .line 76
    iget-object p0, v1, Lx7;->d:Ljava/lang/Object;

    .line 77
    .line 78
    check-cast p0, Landroid/view/LayoutInflater;

    .line 79
    .line 80
    iget v6, v2, La8;->t:I

    .line 81
    .line 82
    invoke-virtual {p0, v6, v5}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    .line 83
    .line 84
    .line 85
    move-result-object p0

    .line 86
    check-cast p0, Landroidx/appcompat/app/AlertController$RecycleListView;

    .line 87
    .line 88
    iget-boolean v6, v1, Lx7;->b:Z

    .line 89
    .line 90
    if-eqz v6, :cond_4

    .line 91
    .line 92
    iget v6, v2, La8;->u:I

    .line 93
    .line 94
    goto :goto_1

    .line 95
    :cond_4
    iget v6, v2, La8;->v:I

    .line 96
    .line 97
    :goto_1
    iget-object v7, v1, Lx7;->j:Ljava/lang/Object;

    .line 98
    .line 99
    check-cast v7, Landroid/widget/ListAdapter;

    .line 100
    .line 101
    if-eqz v7, :cond_5

    .line 102
    .line 103
    goto :goto_2

    .line 104
    :cond_5
    new-instance v7, Lz7;

    .line 105
    .line 106
    iget-object v8, v1, Lx7;->c:Ljava/lang/Object;

    .line 107
    .line 108
    check-cast v8, Landroid/view/ContextThemeWrapper;

    .line 109
    .line 110
    const v9, 0x1020014

    .line 111
    .line 112
    .line 113
    invoke-direct {v7, v8, v6, v9, v5}, Lz7;-><init>(Landroid/content/Context;II[Ljava/lang/Object;)V

    .line 114
    .line 115
    .line 116
    :goto_2
    iput-object v7, v2, La8;->q:Landroid/widget/ListAdapter;

    .line 117
    .line 118
    iget v6, v1, Lx7;->a:I

    .line 119
    .line 120
    iput v6, v2, La8;->r:I

    .line 121
    .line 122
    iget-object v6, v1, Lx7;->k:Ljava/lang/Object;

    .line 123
    .line 124
    check-cast v6, Landroid/content/DialogInterface$OnClickListener;

    .line 125
    .line 126
    if-eqz v6, :cond_6

    .line 127
    .line 128
    new-instance v6, Lw7;

    .line 129
    .line 130
    invoke-direct {v6, v1, v2}, Lw7;-><init>(Lx7;La8;)V

    .line 131
    .line 132
    .line 133
    invoke-virtual {p0, v6}, Landroid/widget/AdapterView;->setOnItemClickListener(Landroid/widget/AdapterView$OnItemClickListener;)V

    .line 134
    .line 135
    .line 136
    :cond_6
    iget-boolean v6, v1, Lx7;->b:Z

    .line 137
    .line 138
    if-eqz v6, :cond_7

    .line 139
    .line 140
    invoke-virtual {p0, v4}, Landroid/widget/AbsListView;->setChoiceMode(I)V

    .line 141
    .line 142
    .line 143
    :cond_7
    iput-object p0, v2, La8;->e:Landroidx/appcompat/app/AlertController$RecycleListView;

    .line 144
    .line 145
    :cond_8
    iget-object p0, v1, Lx7;->h:Ljava/lang/Object;

    .line 146
    .line 147
    check-cast p0, Landroid/view/View;

    .line 148
    .line 149
    if-eqz p0, :cond_9

    .line 150
    .line 151
    iput-object p0, v2, La8;->f:Landroid/view/View;

    .line 152
    .line 153
    iput-boolean v3, v2, La8;->g:Z

    .line 154
    .line 155
    :cond_9
    invoke-virtual {v0, v4}, Landroid/app/Dialog;->setCancelable(Z)V

    .line 156
    .line 157
    .line 158
    invoke-virtual {v0, v4}, Landroid/app/Dialog;->setCanceledOnTouchOutside(Z)V

    .line 159
    .line 160
    .line 161
    invoke-virtual {v0, v5}, Landroid/app/Dialog;->setOnCancelListener(Landroid/content/DialogInterface$OnCancelListener;)V

    .line 162
    .line 163
    .line 164
    invoke-virtual {v0, v5}, Landroid/app/Dialog;->setOnDismissListener(Landroid/content/DialogInterface$OnDismissListener;)V

    .line 165
    .line 166
    .line 167
    iget-object p0, v1, Lx7;->i:Ljava/lang/Object;

    .line 168
    .line 169
    check-cast p0, Lpt4;

    .line 170
    .line 171
    if-eqz p0, :cond_a

    .line 172
    .line 173
    invoke-virtual {v0, p0}, Landroid/app/Dialog;->setOnKeyListener(Landroid/content/DialogInterface$OnKeyListener;)V

    .line 174
    .line 175
    .line 176
    :cond_a
    return-object v0
.end method

.method public f(II)V
    .locals 2

    .line 1
    add-int/2addr p2, p1

    .line 2
    iget-object v0, p0, Lb8;->c:Ljava/lang/Object;

    .line 3
    .line 4
    check-cast v0, [C

    .line 5
    .line 6
    array-length v1, v0

    .line 7
    if-gt v1, p2, :cond_1

    .line 8
    .line 9
    mul-int/lit8 p1, p1, 0x2

    .line 10
    .line 11
    if-ge p2, p1, :cond_0

    .line 12
    .line 13
    move p2, p1

    .line 14
    :cond_0
    invoke-static {v0, p2}, Ljava/util/Arrays;->copyOf([CI)[C

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    iput-object p1, p0, Lb8;->c:Ljava/lang/Object;

    .line 19
    .line 20
    :cond_1
    return-void
.end method

.method public g()[Ljava/lang/String;
    .locals 6

    .line 1
    iget-object v0, p0, Lb8;->c:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lz33;

    .line 4
    .line 5
    iget v1, p0, Lb8;->b:I

    .line 6
    .line 7
    invoke-virtual {v0, v1}, Lz33;->a(I)Lt33;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    const-string v1, ""

    .line 12
    .line 13
    if-eqz v0, :cond_2

    .line 14
    .line 15
    iget v2, v0, Lld2;->b:I

    .line 16
    .line 17
    new-array v2, v2, [Ljava/lang/String;

    .line 18
    .line 19
    const/4 v3, 0x0

    .line 20
    :goto_0
    iget v4, v0, Lld2;->b:I

    .line 21
    .line 22
    if-ge v3, v4, :cond_1

    .line 23
    .line 24
    iget-object v4, p0, Lb8;->c:Ljava/lang/Object;

    .line 25
    .line 26
    check-cast v4, Lz33;

    .line 27
    .line 28
    invoke-virtual {v0, v4, v3}, Lld2;->h(Lz33;I)I

    .line 29
    .line 30
    .line 31
    move-result v4

    .line 32
    iget-object v5, p0, Lb8;->c:Ljava/lang/Object;

    .line 33
    .line 34
    check-cast v5, Lz33;

    .line 35
    .line 36
    invoke-virtual {v5, v4}, Lz33;->g(I)Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object v4

    .line 40
    if-eqz v4, :cond_0

    .line 41
    .line 42
    aput-object v4, v2, v3

    .line 43
    .line 44
    add-int/lit8 v3, v3, 0x1

    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_0
    new-instance p0, Lbl8;

    .line 48
    .line 49
    invoke-direct {p0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    throw p0

    .line 53
    :cond_1
    return-object v2

    .line 54
    :cond_2
    new-instance p0, Lbl8;

    .line 55
    .line 56
    invoke-direct {p0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    throw p0
.end method

.method public h()Z
    .locals 1

    .line 1
    iget v0, p0, Lb8;->b:I

    .line 2
    .line 3
    iget-object p0, p0, Lb8;->c:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast p0, Ljava/util/ArrayList;

    .line 6
    .line 7
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    if-ge v0, p0, :cond_0

    .line 12
    .line 13
    const/4 p0, 0x1

    .line 14
    return p0

    .line 15
    :cond_0
    const/4 p0, 0x0

    .line 16
    return p0
.end method

.method public i(Ljava/util/Map;Lio/sentry/ILogger;)Ljava/util/HashMap;
    .locals 4

    .line 1
    new-instance v0, Ljava/util/HashMap;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-interface {p1}, Ljava/util/Map;->keySet()Ljava/util/Set;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 15
    .line 16
    .line 17
    move-result v2

    .line 18
    if-eqz v2, :cond_1

    .line 19
    .line 20
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    invoke-interface {p1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v3

    .line 28
    if-eqz v3, :cond_0

    .line 29
    .line 30
    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v2

    .line 34
    invoke-virtual {p0, p2, v3}, Lb8;->m(Lio/sentry/ILogger;Ljava/lang/Object;)Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v3

    .line 38
    invoke-virtual {v0, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_0
    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object v2

    .line 46
    const/4 v3, 0x0

    .line 47
    invoke-virtual {v0, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_1
    return-object v0
.end method

.method public j(Lsm2;II)V
    .locals 1

    .line 1
    iget-object p0, p0, Lb8;->c:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Lby0;

    .line 4
    .line 5
    new-instance v0, Lww7;

    .line 6
    .line 7
    invoke-direct {v0, p1}, Lww7;-><init>(Lsm2;)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0, v0, p2, p3}, Lby0;->g(Lqr6;II)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public k()V
    .locals 4

    .line 1
    sget-object v0, Lxp0;->c:Lxp0;

    .line 2
    .line 3
    iget-object p0, p0, Lb8;->c:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast p0, [C

    .line 6
    .line 7
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    monitor-enter v0

    .line 14
    :try_start_0
    iget v1, v0, Lxp0;->b:I

    .line 15
    .line 16
    array-length v2, p0

    .line 17
    add-int/2addr v2, v1

    .line 18
    sget v3, Lyt;->a:I

    .line 19
    .line 20
    if-ge v2, v3, :cond_0

    .line 21
    .line 22
    array-length v2, p0

    .line 23
    add-int/2addr v1, v2

    .line 24
    iput v1, v0, Lxp0;->b:I

    .line 25
    .line 26
    iget-object v1, v0, Lxp0;->a:Lkt;

    .line 27
    .line 28
    invoke-virtual {v1, p0}, Lkt;->addLast(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 29
    .line 30
    .line 31
    goto :goto_0

    .line 32
    :catchall_0
    move-exception p0

    .line 33
    goto :goto_1

    .line 34
    :cond_0
    :goto_0
    monitor-exit v0

    .line 35
    return-void

    .line 36
    :goto_1
    monitor-exit v0

    .line 37
    throw p0
.end method

.method public l(J)V
    .locals 5

    .line 1
    iget v0, p0, Lb8;->b:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    :goto_0
    if-ge v1, v0, :cond_2

    .line 5
    .line 6
    iget-object v2, p0, Lb8;->c:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v2, [J

    .line 9
    .line 10
    aget-wide v3, v2, v1

    .line 11
    .line 12
    cmp-long v2, p1, v3

    .line 13
    .line 14
    if-nez v2, :cond_1

    .line 15
    .line 16
    iget p1, p0, Lb8;->b:I

    .line 17
    .line 18
    add-int/lit8 p1, p1, -0x1

    .line 19
    .line 20
    :goto_1
    if-ge v1, p1, :cond_0

    .line 21
    .line 22
    iget-object p2, p0, Lb8;->c:Ljava/lang/Object;

    .line 23
    .line 24
    check-cast p2, [J

    .line 25
    .line 26
    add-int/lit8 v0, v1, 0x1

    .line 27
    .line 28
    aget-wide v2, p2, v0

    .line 29
    .line 30
    aput-wide v2, p2, v1

    .line 31
    .line 32
    move v1, v0

    .line 33
    goto :goto_1

    .line 34
    :cond_0
    iget p1, p0, Lb8;->b:I

    .line 35
    .line 36
    add-int/lit8 p1, p1, -0x1

    .line 37
    .line 38
    iput p1, p0, Lb8;->b:I

    .line 39
    .line 40
    return-void

    .line 41
    :cond_1
    add-int/lit8 v1, v1, 0x1

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_2
    return-void
.end method

.method public m(Lio/sentry/ILogger;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p2, :cond_0

    .line 3
    .line 4
    return-object v0

    .line 5
    :cond_0
    instance-of v1, p2, Ljava/lang/Character;

    .line 6
    .line 7
    if-eqz v1, :cond_1

    .line 8
    .line 9
    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    return-object p0

    .line 14
    :cond_1
    instance-of v1, p2, Ljava/lang/Number;

    .line 15
    .line 16
    if-eqz v1, :cond_2

    .line 17
    .line 18
    return-object p2

    .line 19
    :cond_2
    instance-of v1, p2, Ljava/lang/Boolean;

    .line 20
    .line 21
    if-eqz v1, :cond_3

    .line 22
    .line 23
    return-object p2

    .line 24
    :cond_3
    instance-of v1, p2, Ljava/lang/String;

    .line 25
    .line 26
    if-eqz v1, :cond_4

    .line 27
    .line 28
    return-object p2

    .line 29
    :cond_4
    instance-of v1, p2, Ljava/util/Locale;

    .line 30
    .line 31
    if-eqz v1, :cond_5

    .line 32
    .line 33
    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    return-object p0

    .line 38
    :cond_5
    instance-of v1, p2, Ljava/util/concurrent/atomic/AtomicIntegerArray;

    .line 39
    .line 40
    const/4 v2, 0x0

    .line 41
    if-eqz v1, :cond_7

    .line 42
    .line 43
    check-cast p2, Ljava/util/concurrent/atomic/AtomicIntegerArray;

    .line 44
    .line 45
    sget-object p0, Lio/sentry/util/e;->a:Ljava/nio/charset/Charset;

    .line 46
    .line 47
    invoke-virtual {p2}, Ljava/util/concurrent/atomic/AtomicIntegerArray;->length()I

    .line 48
    .line 49
    .line 50
    move-result p0

    .line 51
    new-instance p1, Ljava/util/ArrayList;

    .line 52
    .line 53
    invoke-direct {p1, p0}, Ljava/util/ArrayList;-><init>(I)V

    .line 54
    .line 55
    .line 56
    :goto_0
    if-ge v2, p0, :cond_6

    .line 57
    .line 58
    invoke-virtual {p2, v2}, Ljava/util/concurrent/atomic/AtomicIntegerArray;->get(I)I

    .line 59
    .line 60
    .line 61
    move-result v0

    .line 62
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 67
    .line 68
    .line 69
    add-int/lit8 v2, v2, 0x1

    .line 70
    .line 71
    goto :goto_0

    .line 72
    :cond_6
    return-object p1

    .line 73
    :cond_7
    instance-of v1, p2, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 74
    .line 75
    if-eqz v1, :cond_8

    .line 76
    .line 77
    check-cast p2, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 78
    .line 79
    invoke-virtual {p2}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 80
    .line 81
    .line 82
    move-result p0

    .line 83
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 84
    .line 85
    .line 86
    move-result-object p0

    .line 87
    return-object p0

    .line 88
    :cond_8
    instance-of v1, p2, Ljava/net/URI;

    .line 89
    .line 90
    if-eqz v1, :cond_9

    .line 91
    .line 92
    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 93
    .line 94
    .line 95
    move-result-object p0

    .line 96
    return-object p0

    .line 97
    :cond_9
    instance-of v1, p2, Ljava/net/InetAddress;

    .line 98
    .line 99
    if-eqz v1, :cond_a

    .line 100
    .line 101
    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 102
    .line 103
    .line 104
    move-result-object p0

    .line 105
    return-object p0

    .line 106
    :cond_a
    instance-of v1, p2, Ljava/util/UUID;

    .line 107
    .line 108
    if-eqz v1, :cond_b

    .line 109
    .line 110
    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 111
    .line 112
    .line 113
    move-result-object p0

    .line 114
    return-object p0

    .line 115
    :cond_b
    instance-of v1, p2, Ljava/util/Currency;

    .line 116
    .line 117
    if-eqz v1, :cond_c

    .line 118
    .line 119
    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 120
    .line 121
    .line 122
    move-result-object p0

    .line 123
    return-object p0

    .line 124
    :cond_c
    instance-of v1, p2, Ljava/util/Calendar;

    .line 125
    .line 126
    if-eqz v1, :cond_d

    .line 127
    .line 128
    check-cast p2, Ljava/util/Calendar;

    .line 129
    .line 130
    invoke-static {p2}, Lio/sentry/util/e;->a(Ljava/util/Calendar;)Ljava/util/HashMap;

    .line 131
    .line 132
    .line 133
    move-result-object p0

    .line 134
    return-object p0

    .line 135
    :cond_d
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 136
    .line 137
    .line 138
    move-result-object v1

    .line 139
    invoke-virtual {v1}, Ljava/lang/Class;->isEnum()Z

    .line 140
    .line 141
    .line 142
    move-result v1

    .line 143
    if-eqz v1, :cond_e

    .line 144
    .line 145
    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 146
    .line 147
    .line 148
    move-result-object p0

    .line 149
    return-object p0

    .line 150
    :cond_e
    iget-object v1, p0, Lb8;->c:Ljava/lang/Object;

    .line 151
    .line 152
    check-cast v1, Ljava/util/HashSet;

    .line 153
    .line 154
    if-nez v1, :cond_f

    .line 155
    .line 156
    new-instance v1, Ljava/util/HashSet;

    .line 157
    .line 158
    invoke-direct {v1}, Ljava/util/HashSet;-><init>()V

    .line 159
    .line 160
    .line 161
    iput-object v1, p0, Lb8;->c:Ljava/lang/Object;

    .line 162
    .line 163
    :cond_f
    invoke-interface {v1, p2}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 164
    .line 165
    .line 166
    move-result v3

    .line 167
    if-eqz v3, :cond_10

    .line 168
    .line 169
    sget-object p0, Lio/sentry/s5;->INFO:Lio/sentry/s5;

    .line 170
    .line 171
    const-string v0, "Cyclic reference detected. Calling toString() on object."

    .line 172
    .line 173
    new-array v1, v2, [Ljava/lang/Object;

    .line 174
    .line 175
    invoke-interface {p1, p0, v0, v1}, Lio/sentry/ILogger;->h(Lio/sentry/s5;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 176
    .line 177
    .line 178
    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 179
    .line 180
    .line 181
    move-result-object p0

    .line 182
    return-object p0

    .line 183
    :cond_10
    invoke-interface {v1, p2}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 184
    .line 185
    .line 186
    invoke-interface {v1}, Ljava/util/Set;->size()I

    .line 187
    .line 188
    .line 189
    move-result v3

    .line 190
    iget v4, p0, Lb8;->b:I

    .line 191
    .line 192
    if-le v3, v4, :cond_11

    .line 193
    .line 194
    invoke-interface {v1, p2}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    .line 195
    .line 196
    .line 197
    sget-object p0, Lio/sentry/s5;->INFO:Lio/sentry/s5;

    .line 198
    .line 199
    const-string v0, "Max depth exceeded. Calling toString() on object."

    .line 200
    .line 201
    new-array v1, v2, [Ljava/lang/Object;

    .line 202
    .line 203
    invoke-interface {p1, p0, v0, v1}, Lio/sentry/ILogger;->h(Lio/sentry/s5;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 204
    .line 205
    .line 206
    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 207
    .line 208
    .line 209
    move-result-object p0

    .line 210
    return-object p0

    .line 211
    :cond_11
    :try_start_0
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 212
    .line 213
    .line 214
    move-result-object v3

    .line 215
    invoke-virtual {v3}, Ljava/lang/Class;->isArray()Z

    .line 216
    .line 217
    .line 218
    move-result v3

    .line 219
    if-eqz v3, :cond_12

    .line 220
    .line 221
    move-object v3, p2

    .line 222
    check-cast v3, [Ljava/lang/Object;

    .line 223
    .line 224
    new-instance v4, Ljava/util/ArrayList;

    .line 225
    .line 226
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 227
    .line 228
    .line 229
    array-length v5, v3

    .line 230
    :goto_1
    if-ge v2, v5, :cond_15

    .line 231
    .line 232
    aget-object v6, v3, v2

    .line 233
    .line 234
    invoke-virtual {p0, p1, v6}, Lb8;->m(Lio/sentry/ILogger;Ljava/lang/Object;)Ljava/lang/Object;

    .line 235
    .line 236
    .line 237
    move-result-object v6

    .line 238
    invoke-virtual {v4, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 239
    .line 240
    .line 241
    add-int/lit8 v2, v2, 0x1

    .line 242
    .line 243
    goto :goto_1

    .line 244
    :catchall_0
    move-exception p0

    .line 245
    goto :goto_5

    .line 246
    :catch_0
    move-exception p0

    .line 247
    goto :goto_4

    .line 248
    :cond_12
    instance-of v2, p2, Ljava/util/Collection;

    .line 249
    .line 250
    if-eqz v2, :cond_13

    .line 251
    .line 252
    move-object v2, p2

    .line 253
    check-cast v2, Ljava/util/Collection;

    .line 254
    .line 255
    new-instance v4, Ljava/util/ArrayList;

    .line 256
    .line 257
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 258
    .line 259
    .line 260
    invoke-interface {v2}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 261
    .line 262
    .line 263
    move-result-object v2

    .line 264
    :goto_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 265
    .line 266
    .line 267
    move-result v3

    .line 268
    if-eqz v3, :cond_15

    .line 269
    .line 270
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 271
    .line 272
    .line 273
    move-result-object v3

    .line 274
    invoke-virtual {p0, p1, v3}, Lb8;->m(Lio/sentry/ILogger;Ljava/lang/Object;)Ljava/lang/Object;

    .line 275
    .line 276
    .line 277
    move-result-object v3

    .line 278
    invoke-virtual {v4, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 279
    .line 280
    .line 281
    goto :goto_2

    .line 282
    :cond_13
    instance-of v2, p2, Ljava/util/Map;

    .line 283
    .line 284
    if-eqz v2, :cond_14

    .line 285
    .line 286
    move-object v2, p2

    .line 287
    check-cast v2, Ljava/util/Map;

    .line 288
    .line 289
    invoke-virtual {p0, v2, p1}, Lb8;->i(Ljava/util/Map;Lio/sentry/ILogger;)Ljava/util/HashMap;

    .line 290
    .line 291
    .line 292
    move-result-object v4

    .line 293
    goto :goto_3

    .line 294
    :cond_14
    invoke-virtual {p0, p1, p2}, Lb8;->q(Lio/sentry/ILogger;Ljava/lang/Object;)Ljava/util/HashMap;

    .line 295
    .line 296
    .line 297
    move-result-object v4

    .line 298
    invoke-virtual {v4}, Ljava/util/HashMap;->isEmpty()Z

    .line 299
    .line 300
    .line 301
    move-result p0

    .line 302
    if-eqz p0, :cond_15

    .line 303
    .line 304
    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 305
    .line 306
    .line 307
    move-result-object v4
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 308
    :cond_15
    :goto_3
    invoke-interface {v1, p2}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    .line 309
    .line 310
    .line 311
    return-object v4

    .line 312
    :goto_4
    :try_start_1
    sget-object v2, Lio/sentry/s5;->INFO:Lio/sentry/s5;

    .line 313
    .line 314
    const-string v3, "Not serializing object due to throwing sub-path."

    .line 315
    .line 316
    invoke-interface {p1, v2, v3, p0}, Lio/sentry/ILogger;->e(Lio/sentry/s5;Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 317
    .line 318
    .line 319
    invoke-interface {v1, p2}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    .line 320
    .line 321
    .line 322
    return-object v0

    .line 323
    :goto_5
    invoke-interface {v1, p2}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    .line 324
    .line 325
    .line 326
    throw p0
.end method

.method public n(Lio/sentry/internal/debugmeta/c;Lio/sentry/ILogger;Ljava/lang/Object;)V
    .locals 5

    .line 1
    iget-object v0, p1, Lio/sentry/internal/debugmeta/c;->Y:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lio/sentry/vendor/gson/stream/c;

    .line 4
    .line 5
    if-nez p3, :cond_0

    .line 6
    .line 7
    invoke-virtual {v0}, Lio/sentry/vendor/gson/stream/c;->p()V

    .line 8
    .line 9
    .line 10
    return-void

    .line 11
    :cond_0
    instance-of v1, p3, Ljava/lang/Character;

    .line 12
    .line 13
    if-eqz v1, :cond_1

    .line 14
    .line 15
    check-cast p3, Ljava/lang/Character;

    .line 16
    .line 17
    invoke-virtual {p3}, Ljava/lang/Character;->charValue()C

    .line 18
    .line 19
    .line 20
    move-result p0

    .line 21
    invoke-static {p0}, Ljava/lang/Character;->toString(C)Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    invoke-virtual {p1, p0}, Lio/sentry/internal/debugmeta/c;->y(Ljava/lang/String;)Lio/sentry/internal/debugmeta/c;

    .line 26
    .line 27
    .line 28
    return-void

    .line 29
    :cond_1
    instance-of v1, p3, Ljava/lang/String;

    .line 30
    .line 31
    if-eqz v1, :cond_2

    .line 32
    .line 33
    check-cast p3, Ljava/lang/String;

    .line 34
    .line 35
    invoke-virtual {p1, p3}, Lio/sentry/internal/debugmeta/c;->y(Ljava/lang/String;)Lio/sentry/internal/debugmeta/c;

    .line 36
    .line 37
    .line 38
    return-void

    .line 39
    :cond_2
    instance-of v1, p3, Ljava/lang/Boolean;

    .line 40
    .line 41
    if-eqz v1, :cond_3

    .line 42
    .line 43
    check-cast p3, Ljava/lang/Boolean;

    .line 44
    .line 45
    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 46
    .line 47
    .line 48
    move-result p0

    .line 49
    invoke-virtual {p1, p0}, Lio/sentry/internal/debugmeta/c;->z(Z)Lio/sentry/internal/debugmeta/c;

    .line 50
    .line 51
    .line 52
    return-void

    .line 53
    :cond_3
    instance-of v1, p3, Ljava/lang/Number;

    .line 54
    .line 55
    if-eqz v1, :cond_4

    .line 56
    .line 57
    check-cast p3, Ljava/lang/Number;

    .line 58
    .line 59
    invoke-virtual {p1, p3}, Lio/sentry/internal/debugmeta/c;->x(Ljava/lang/Number;)Lio/sentry/internal/debugmeta/c;

    .line 60
    .line 61
    .line 62
    return-void

    .line 63
    :cond_4
    instance-of v1, p3, Ljava/util/Date;

    .line 64
    .line 65
    if-eqz v1, :cond_5

    .line 66
    .line 67
    check-cast p3, Ljava/util/Date;

    .line 68
    .line 69
    :try_start_0
    invoke-virtual {p3}, Ljava/util/Date;->getTime()J

    .line 70
    .line 71
    .line 72
    move-result-wide v1

    .line 73
    invoke-static {v1, v2}, Lio/sentry/vendor/a;->f(J)Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    move-result-object p0

    .line 77
    invoke-virtual {p1, p0}, Lio/sentry/internal/debugmeta/c;->y(Ljava/lang/String;)Lio/sentry/internal/debugmeta/c;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 78
    .line 79
    .line 80
    goto/16 :goto_9

    .line 81
    .line 82
    :catch_0
    move-exception p0

    .line 83
    sget-object p1, Lio/sentry/s5;->ERROR:Lio/sentry/s5;

    .line 84
    .line 85
    const-string p3, "Error when serializing Date"

    .line 86
    .line 87
    invoke-interface {p2, p1, p3, p0}, Lio/sentry/ILogger;->e(Lio/sentry/s5;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 88
    .line 89
    .line 90
    invoke-virtual {v0}, Lio/sentry/vendor/gson/stream/c;->p()V

    .line 91
    .line 92
    .line 93
    goto/16 :goto_9

    .line 94
    .line 95
    :cond_5
    instance-of v1, p3, Ljava/util/TimeZone;

    .line 96
    .line 97
    if-eqz v1, :cond_6

    .line 98
    .line 99
    check-cast p3, Ljava/util/TimeZone;

    .line 100
    .line 101
    :try_start_1
    invoke-virtual {p3}, Ljava/util/TimeZone;->getID()Ljava/lang/String;

    .line 102
    .line 103
    .line 104
    move-result-object p0

    .line 105
    invoke-virtual {p1, p0}, Lio/sentry/internal/debugmeta/c;->y(Ljava/lang/String;)Lio/sentry/internal/debugmeta/c;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 106
    .line 107
    .line 108
    goto/16 :goto_9

    .line 109
    .line 110
    :catch_1
    move-exception p0

    .line 111
    sget-object p1, Lio/sentry/s5;->ERROR:Lio/sentry/s5;

    .line 112
    .line 113
    const-string p3, "Error when serializing TimeZone"

    .line 114
    .line 115
    invoke-interface {p2, p1, p3, p0}, Lio/sentry/ILogger;->e(Lio/sentry/s5;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 116
    .line 117
    .line 118
    invoke-virtual {v0}, Lio/sentry/vendor/gson/stream/c;->p()V

    .line 119
    .line 120
    .line 121
    goto/16 :goto_9

    .line 122
    .line 123
    :cond_6
    instance-of v0, p3, Lio/sentry/n2;

    .line 124
    .line 125
    if-eqz v0, :cond_7

    .line 126
    .line 127
    check-cast p3, Lio/sentry/n2;

    .line 128
    .line 129
    invoke-interface {p3, p1, p2}, Lio/sentry/n2;->serialize(Lio/sentry/r3;Lio/sentry/ILogger;)V

    .line 130
    .line 131
    .line 132
    return-void

    .line 133
    :cond_7
    instance-of v0, p3, Ljava/util/Collection;

    .line 134
    .line 135
    if-eqz v0, :cond_8

    .line 136
    .line 137
    check-cast p3, Ljava/util/Collection;

    .line 138
    .line 139
    invoke-virtual {p0, p1, p2, p3}, Lb8;->o(Lio/sentry/internal/debugmeta/c;Lio/sentry/ILogger;Ljava/util/Collection;)V

    .line 140
    .line 141
    .line 142
    return-void

    .line 143
    :cond_8
    instance-of v0, p3, [Z

    .line 144
    .line 145
    const/4 v1, 0x0

    .line 146
    if-eqz v0, :cond_a

    .line 147
    .line 148
    new-instance v0, Ljava/util/ArrayList;

    .line 149
    .line 150
    check-cast p3, [Z

    .line 151
    .line 152
    array-length v2, p3

    .line 153
    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 154
    .line 155
    .line 156
    array-length v2, p3

    .line 157
    :goto_0
    if-ge v1, v2, :cond_9

    .line 158
    .line 159
    aget-boolean v3, p3, v1

    .line 160
    .line 161
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 162
    .line 163
    .line 164
    move-result-object v3

    .line 165
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 166
    .line 167
    .line 168
    add-int/lit8 v1, v1, 0x1

    .line 169
    .line 170
    goto :goto_0

    .line 171
    :cond_9
    invoke-virtual {p0, p1, p2, v0}, Lb8;->o(Lio/sentry/internal/debugmeta/c;Lio/sentry/ILogger;Ljava/util/Collection;)V

    .line 172
    .line 173
    .line 174
    return-void

    .line 175
    :cond_a
    instance-of v0, p3, [B

    .line 176
    .line 177
    if-eqz v0, :cond_c

    .line 178
    .line 179
    new-instance v0, Ljava/util/ArrayList;

    .line 180
    .line 181
    check-cast p3, [B

    .line 182
    .line 183
    array-length v2, p3

    .line 184
    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 185
    .line 186
    .line 187
    array-length v2, p3

    .line 188
    :goto_1
    if-ge v1, v2, :cond_b

    .line 189
    .line 190
    aget-byte v3, p3, v1

    .line 191
    .line 192
    invoke-static {v3}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    .line 193
    .line 194
    .line 195
    move-result-object v3

    .line 196
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 197
    .line 198
    .line 199
    add-int/lit8 v1, v1, 0x1

    .line 200
    .line 201
    goto :goto_1

    .line 202
    :cond_b
    invoke-virtual {p0, p1, p2, v0}, Lb8;->o(Lio/sentry/internal/debugmeta/c;Lio/sentry/ILogger;Ljava/util/Collection;)V

    .line 203
    .line 204
    .line 205
    return-void

    .line 206
    :cond_c
    instance-of v0, p3, [S

    .line 207
    .line 208
    if-eqz v0, :cond_e

    .line 209
    .line 210
    new-instance v0, Ljava/util/ArrayList;

    .line 211
    .line 212
    check-cast p3, [S

    .line 213
    .line 214
    array-length v2, p3

    .line 215
    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 216
    .line 217
    .line 218
    array-length v2, p3

    .line 219
    :goto_2
    if-ge v1, v2, :cond_d

    .line 220
    .line 221
    aget-short v3, p3, v1

    .line 222
    .line 223
    invoke-static {v3}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    .line 224
    .line 225
    .line 226
    move-result-object v3

    .line 227
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 228
    .line 229
    .line 230
    add-int/lit8 v1, v1, 0x1

    .line 231
    .line 232
    goto :goto_2

    .line 233
    :cond_d
    invoke-virtual {p0, p1, p2, v0}, Lb8;->o(Lio/sentry/internal/debugmeta/c;Lio/sentry/ILogger;Ljava/util/Collection;)V

    .line 234
    .line 235
    .line 236
    return-void

    .line 237
    :cond_e
    instance-of v0, p3, [C

    .line 238
    .line 239
    if-eqz v0, :cond_10

    .line 240
    .line 241
    new-instance v0, Ljava/util/ArrayList;

    .line 242
    .line 243
    check-cast p3, [C

    .line 244
    .line 245
    array-length v2, p3

    .line 246
    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 247
    .line 248
    .line 249
    array-length v2, p3

    .line 250
    :goto_3
    if-ge v1, v2, :cond_f

    .line 251
    .line 252
    aget-char v3, p3, v1

    .line 253
    .line 254
    invoke-static {v3}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    .line 255
    .line 256
    .line 257
    move-result-object v3

    .line 258
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 259
    .line 260
    .line 261
    add-int/lit8 v1, v1, 0x1

    .line 262
    .line 263
    goto :goto_3

    .line 264
    :cond_f
    invoke-virtual {p0, p1, p2, v0}, Lb8;->o(Lio/sentry/internal/debugmeta/c;Lio/sentry/ILogger;Ljava/util/Collection;)V

    .line 265
    .line 266
    .line 267
    return-void

    .line 268
    :cond_10
    instance-of v0, p3, [I

    .line 269
    .line 270
    if-eqz v0, :cond_12

    .line 271
    .line 272
    new-instance v0, Ljava/util/ArrayList;

    .line 273
    .line 274
    check-cast p3, [I

    .line 275
    .line 276
    array-length v2, p3

    .line 277
    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 278
    .line 279
    .line 280
    array-length v2, p3

    .line 281
    :goto_4
    if-ge v1, v2, :cond_11

    .line 282
    .line 283
    aget v3, p3, v1

    .line 284
    .line 285
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 286
    .line 287
    .line 288
    move-result-object v3

    .line 289
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 290
    .line 291
    .line 292
    add-int/lit8 v1, v1, 0x1

    .line 293
    .line 294
    goto :goto_4

    .line 295
    :cond_11
    invoke-virtual {p0, p1, p2, v0}, Lb8;->o(Lio/sentry/internal/debugmeta/c;Lio/sentry/ILogger;Ljava/util/Collection;)V

    .line 296
    .line 297
    .line 298
    return-void

    .line 299
    :cond_12
    instance-of v0, p3, [J

    .line 300
    .line 301
    if-eqz v0, :cond_14

    .line 302
    .line 303
    new-instance v0, Ljava/util/ArrayList;

    .line 304
    .line 305
    check-cast p3, [J

    .line 306
    .line 307
    array-length v2, p3

    .line 308
    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 309
    .line 310
    .line 311
    array-length v2, p3

    .line 312
    :goto_5
    if-ge v1, v2, :cond_13

    .line 313
    .line 314
    aget-wide v3, p3, v1

    .line 315
    .line 316
    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 317
    .line 318
    .line 319
    move-result-object v3

    .line 320
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 321
    .line 322
    .line 323
    add-int/lit8 v1, v1, 0x1

    .line 324
    .line 325
    goto :goto_5

    .line 326
    :cond_13
    invoke-virtual {p0, p1, p2, v0}, Lb8;->o(Lio/sentry/internal/debugmeta/c;Lio/sentry/ILogger;Ljava/util/Collection;)V

    .line 327
    .line 328
    .line 329
    return-void

    .line 330
    :cond_14
    instance-of v0, p3, [F

    .line 331
    .line 332
    if-eqz v0, :cond_16

    .line 333
    .line 334
    new-instance v0, Ljava/util/ArrayList;

    .line 335
    .line 336
    check-cast p3, [F

    .line 337
    .line 338
    array-length v2, p3

    .line 339
    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 340
    .line 341
    .line 342
    array-length v2, p3

    .line 343
    :goto_6
    if-ge v1, v2, :cond_15

    .line 344
    .line 345
    aget v3, p3, v1

    .line 346
    .line 347
    invoke-static {v3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 348
    .line 349
    .line 350
    move-result-object v3

    .line 351
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 352
    .line 353
    .line 354
    add-int/lit8 v1, v1, 0x1

    .line 355
    .line 356
    goto :goto_6

    .line 357
    :cond_15
    invoke-virtual {p0, p1, p2, v0}, Lb8;->o(Lio/sentry/internal/debugmeta/c;Lio/sentry/ILogger;Ljava/util/Collection;)V

    .line 358
    .line 359
    .line 360
    return-void

    .line 361
    :cond_16
    instance-of v0, p3, [D

    .line 362
    .line 363
    if-eqz v0, :cond_18

    .line 364
    .line 365
    new-instance v0, Ljava/util/ArrayList;

    .line 366
    .line 367
    check-cast p3, [D

    .line 368
    .line 369
    array-length v2, p3

    .line 370
    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 371
    .line 372
    .line 373
    array-length v2, p3

    .line 374
    :goto_7
    if-ge v1, v2, :cond_17

    .line 375
    .line 376
    aget-wide v3, p3, v1

    .line 377
    .line 378
    invoke-static {v3, v4}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 379
    .line 380
    .line 381
    move-result-object v3

    .line 382
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 383
    .line 384
    .line 385
    add-int/lit8 v1, v1, 0x1

    .line 386
    .line 387
    goto :goto_7

    .line 388
    :cond_17
    invoke-virtual {p0, p1, p2, v0}, Lb8;->o(Lio/sentry/internal/debugmeta/c;Lio/sentry/ILogger;Ljava/util/Collection;)V

    .line 389
    .line 390
    .line 391
    return-void

    .line 392
    :cond_18
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 393
    .line 394
    .line 395
    move-result-object v0

    .line 396
    invoke-virtual {v0}, Ljava/lang/Class;->isArray()Z

    .line 397
    .line 398
    .line 399
    move-result v0

    .line 400
    if-eqz v0, :cond_19

    .line 401
    .line 402
    check-cast p3, [Ljava/lang/Object;

    .line 403
    .line 404
    invoke-static {p3}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 405
    .line 406
    .line 407
    move-result-object p3

    .line 408
    invoke-virtual {p0, p1, p2, p3}, Lb8;->o(Lio/sentry/internal/debugmeta/c;Lio/sentry/ILogger;Ljava/util/Collection;)V

    .line 409
    .line 410
    .line 411
    return-void

    .line 412
    :cond_19
    instance-of v0, p3, Ljava/util/Map;

    .line 413
    .line 414
    if-eqz v0, :cond_1a

    .line 415
    .line 416
    check-cast p3, Ljava/util/Map;

    .line 417
    .line 418
    invoke-virtual {p0, p1, p2, p3}, Lb8;->p(Lio/sentry/internal/debugmeta/c;Lio/sentry/ILogger;Ljava/util/Map;)V

    .line 419
    .line 420
    .line 421
    return-void

    .line 422
    :cond_1a
    instance-of v0, p3, Ljava/util/Locale;

    .line 423
    .line 424
    if-eqz v0, :cond_1b

    .line 425
    .line 426
    invoke-virtual {p3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 427
    .line 428
    .line 429
    move-result-object p0

    .line 430
    invoke-virtual {p1, p0}, Lio/sentry/internal/debugmeta/c;->y(Ljava/lang/String;)Lio/sentry/internal/debugmeta/c;

    .line 431
    .line 432
    .line 433
    return-void

    .line 434
    :cond_1b
    instance-of v0, p3, Ljava/util/concurrent/atomic/AtomicIntegerArray;

    .line 435
    .line 436
    if-eqz v0, :cond_1d

    .line 437
    .line 438
    check-cast p3, Ljava/util/concurrent/atomic/AtomicIntegerArray;

    .line 439
    .line 440
    sget-object v0, Lio/sentry/util/e;->a:Ljava/nio/charset/Charset;

    .line 441
    .line 442
    invoke-virtual {p3}, Ljava/util/concurrent/atomic/AtomicIntegerArray;->length()I

    .line 443
    .line 444
    .line 445
    move-result v0

    .line 446
    new-instance v2, Ljava/util/ArrayList;

    .line 447
    .line 448
    invoke-direct {v2, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 449
    .line 450
    .line 451
    :goto_8
    if-ge v1, v0, :cond_1c

    .line 452
    .line 453
    invoke-virtual {p3, v1}, Ljava/util/concurrent/atomic/AtomicIntegerArray;->get(I)I

    .line 454
    .line 455
    .line 456
    move-result v3

    .line 457
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 458
    .line 459
    .line 460
    move-result-object v3

    .line 461
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 462
    .line 463
    .line 464
    add-int/lit8 v1, v1, 0x1

    .line 465
    .line 466
    goto :goto_8

    .line 467
    :cond_1c
    invoke-virtual {p0, p1, p2, v2}, Lb8;->o(Lio/sentry/internal/debugmeta/c;Lio/sentry/ILogger;Ljava/util/Collection;)V

    .line 468
    .line 469
    .line 470
    return-void

    .line 471
    :cond_1d
    instance-of v0, p3, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 472
    .line 473
    if-eqz v0, :cond_1e

    .line 474
    .line 475
    check-cast p3, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 476
    .line 477
    invoke-virtual {p3}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 478
    .line 479
    .line 480
    move-result p0

    .line 481
    invoke-virtual {p1, p0}, Lio/sentry/internal/debugmeta/c;->z(Z)Lio/sentry/internal/debugmeta/c;

    .line 482
    .line 483
    .line 484
    return-void

    .line 485
    :cond_1e
    instance-of v0, p3, Ljava/net/URI;

    .line 486
    .line 487
    if-eqz v0, :cond_1f

    .line 488
    .line 489
    invoke-virtual {p3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 490
    .line 491
    .line 492
    move-result-object p0

    .line 493
    invoke-virtual {p1, p0}, Lio/sentry/internal/debugmeta/c;->y(Ljava/lang/String;)Lio/sentry/internal/debugmeta/c;

    .line 494
    .line 495
    .line 496
    return-void

    .line 497
    :cond_1f
    instance-of v0, p3, Ljava/net/InetAddress;

    .line 498
    .line 499
    if-eqz v0, :cond_20

    .line 500
    .line 501
    invoke-virtual {p3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 502
    .line 503
    .line 504
    move-result-object p0

    .line 505
    invoke-virtual {p1, p0}, Lio/sentry/internal/debugmeta/c;->y(Ljava/lang/String;)Lio/sentry/internal/debugmeta/c;

    .line 506
    .line 507
    .line 508
    return-void

    .line 509
    :cond_20
    instance-of v0, p3, Ljava/util/UUID;

    .line 510
    .line 511
    if-eqz v0, :cond_21

    .line 512
    .line 513
    invoke-virtual {p3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 514
    .line 515
    .line 516
    move-result-object p0

    .line 517
    invoke-virtual {p1, p0}, Lio/sentry/internal/debugmeta/c;->y(Ljava/lang/String;)Lio/sentry/internal/debugmeta/c;

    .line 518
    .line 519
    .line 520
    return-void

    .line 521
    :cond_21
    instance-of v0, p3, Ljava/util/Currency;

    .line 522
    .line 523
    if-eqz v0, :cond_22

    .line 524
    .line 525
    invoke-virtual {p3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 526
    .line 527
    .line 528
    move-result-object p0

    .line 529
    invoke-virtual {p1, p0}, Lio/sentry/internal/debugmeta/c;->y(Ljava/lang/String;)Lio/sentry/internal/debugmeta/c;

    .line 530
    .line 531
    .line 532
    return-void

    .line 533
    :cond_22
    instance-of v0, p3, Ljava/util/Calendar;

    .line 534
    .line 535
    if-eqz v0, :cond_23

    .line 536
    .line 537
    check-cast p3, Ljava/util/Calendar;

    .line 538
    .line 539
    invoke-static {p3}, Lio/sentry/util/e;->a(Ljava/util/Calendar;)Ljava/util/HashMap;

    .line 540
    .line 541
    .line 542
    move-result-object p3

    .line 543
    invoke-virtual {p0, p1, p2, p3}, Lb8;->p(Lio/sentry/internal/debugmeta/c;Lio/sentry/ILogger;Ljava/util/Map;)V

    .line 544
    .line 545
    .line 546
    return-void

    .line 547
    :cond_23
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 548
    .line 549
    .line 550
    move-result-object v0

    .line 551
    invoke-virtual {v0}, Ljava/lang/Class;->isEnum()Z

    .line 552
    .line 553
    .line 554
    move-result v0

    .line 555
    if-eqz v0, :cond_24

    .line 556
    .line 557
    invoke-virtual {p3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 558
    .line 559
    .line 560
    move-result-object p0

    .line 561
    invoke-virtual {p1, p0}, Lio/sentry/internal/debugmeta/c;->y(Ljava/lang/String;)Lio/sentry/internal/debugmeta/c;

    .line 562
    .line 563
    .line 564
    return-void

    .line 565
    :cond_24
    :try_start_2
    iget-object v0, p0, Lb8;->c:Ljava/lang/Object;

    .line 566
    .line 567
    check-cast v0, Lb8;

    .line 568
    .line 569
    if-nez v0, :cond_25

    .line 570
    .line 571
    new-instance v0, Lb8;

    .line 572
    .line 573
    iget v1, p0, Lb8;->b:I

    .line 574
    .line 575
    const/16 v2, 0xf

    .line 576
    .line 577
    invoke-direct {v0, v2, v1}, Lb8;-><init>(BI)V

    .line 578
    .line 579
    .line 580
    iput-object v0, p0, Lb8;->c:Ljava/lang/Object;

    .line 581
    .line 582
    :cond_25
    invoke-virtual {v0, p2, p3}, Lb8;->m(Lio/sentry/ILogger;Ljava/lang/Object;)Ljava/lang/Object;

    .line 583
    .line 584
    .line 585
    move-result-object p3

    .line 586
    invoke-virtual {p0, p1, p2, p3}, Lb8;->n(Lio/sentry/internal/debugmeta/c;Lio/sentry/ILogger;Ljava/lang/Object;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2

    .line 587
    .line 588
    .line 589
    return-void

    .line 590
    :catch_2
    move-exception p0

    .line 591
    sget-object p3, Lio/sentry/s5;->ERROR:Lio/sentry/s5;

    .line 592
    .line 593
    const-string v0, "Failed serializing unknown object."

    .line 594
    .line 595
    invoke-interface {p2, p3, v0, p0}, Lio/sentry/ILogger;->e(Lio/sentry/s5;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 596
    .line 597
    .line 598
    const-string p0, "[OBJECT]"

    .line 599
    .line 600
    invoke-virtual {p1, p0}, Lio/sentry/internal/debugmeta/c;->y(Ljava/lang/String;)Lio/sentry/internal/debugmeta/c;

    .line 601
    .line 602
    .line 603
    :goto_9
    return-void
.end method

.method public o(Lio/sentry/internal/debugmeta/c;Lio/sentry/ILogger;Ljava/util/Collection;)V
    .locals 5

    .line 1
    iget-object v0, p1, Lio/sentry/internal/debugmeta/c;->Y:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lio/sentry/vendor/gson/stream/c;

    .line 4
    .line 5
    invoke-virtual {v0}, Lio/sentry/vendor/gson/stream/c;->D()V

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0}, Lio/sentry/vendor/gson/stream/c;->g()V

    .line 9
    .line 10
    .line 11
    iget v1, v0, Lio/sentry/vendor/gson/stream/c;->Z:I

    .line 12
    .line 13
    iget-object v2, v0, Lio/sentry/vendor/gson/stream/c;->Y:[I

    .line 14
    .line 15
    array-length v3, v2

    .line 16
    const/4 v4, 0x2

    .line 17
    if-ne v1, v3, :cond_0

    .line 18
    .line 19
    mul-int/2addr v1, v4

    .line 20
    invoke-static {v2, v1}, Ljava/util/Arrays;->copyOf([II)[I

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    iput-object v2, v0, Lio/sentry/vendor/gson/stream/c;->Y:[I

    .line 25
    .line 26
    :cond_0
    iget v1, v0, Lio/sentry/vendor/gson/stream/c;->Z:I

    .line 27
    .line 28
    add-int/lit8 v3, v1, 0x1

    .line 29
    .line 30
    iput v3, v0, Lio/sentry/vendor/gson/stream/c;->Z:I

    .line 31
    .line 32
    const/4 v3, 0x1

    .line 33
    aput v3, v2, v1

    .line 34
    .line 35
    iget-object v1, v0, Lio/sentry/vendor/gson/stream/c;->X:Ljava/io/Writer;

    .line 36
    .line 37
    const/16 v2, 0x5b

    .line 38
    .line 39
    invoke-virtual {v1, v2}, Ljava/io/Writer;->write(I)V

    .line 40
    .line 41
    .line 42
    invoke-interface {p3}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 43
    .line 44
    .line 45
    move-result-object p3

    .line 46
    :goto_0
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    .line 47
    .line 48
    .line 49
    move-result v1

    .line 50
    if-eqz v1, :cond_1

    .line 51
    .line 52
    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object v1

    .line 56
    invoke-virtual {p0, p1, p2, v1}, Lb8;->n(Lio/sentry/internal/debugmeta/c;Lio/sentry/ILogger;Ljava/lang/Object;)V

    .line 57
    .line 58
    .line 59
    goto :goto_0

    .line 60
    :cond_1
    const/16 p0, 0x5d

    .line 61
    .line 62
    invoke-virtual {v0, v3, v4, p0}, Lio/sentry/vendor/gson/stream/c;->k(IIC)V

    .line 63
    .line 64
    .line 65
    return-void
.end method

.method public p(Lio/sentry/internal/debugmeta/c;Lio/sentry/ILogger;Ljava/util/Map;)V
    .locals 3

    .line 1
    invoke-virtual {p1}, Lio/sentry/internal/debugmeta/c;->k()Lio/sentry/internal/debugmeta/c;

    .line 2
    .line 3
    .line 4
    invoke-interface {p3}, Ljava/util/Map;->keySet()Ljava/util/Set;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    if-eqz v1, :cond_1

    .line 17
    .line 18
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    instance-of v2, v1, Ljava/lang/String;

    .line 23
    .line 24
    if-eqz v2, :cond_0

    .line 25
    .line 26
    move-object v2, v1

    .line 27
    check-cast v2, Ljava/lang/String;

    .line 28
    .line 29
    invoke-virtual {p1, v2}, Lio/sentry/internal/debugmeta/c;->p(Ljava/lang/String;)Lio/sentry/internal/debugmeta/c;

    .line 30
    .line 31
    .line 32
    invoke-interface {p3, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    invoke-virtual {p0, p1, p2, v1}, Lb8;->n(Lio/sentry/internal/debugmeta/c;Lio/sentry/ILogger;Ljava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_1
    invoke-virtual {p1}, Lio/sentry/internal/debugmeta/c;->m()Lio/sentry/internal/debugmeta/c;

    .line 41
    .line 42
    .line 43
    return-void
.end method

.method public q(Lio/sentry/ILogger;Ljava/lang/Object;)Ljava/util/HashMap;
    .locals 9

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Ljava/lang/Class;->getDeclaredFields()[Ljava/lang/reflect/Field;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    new-instance v1, Ljava/util/HashMap;

    .line 10
    .line 11
    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    .line 12
    .line 13
    .line 14
    array-length v2, v0

    .line 15
    const/4 v3, 0x0

    .line 16
    move v4, v3

    .line 17
    :goto_0
    if-ge v4, v2, :cond_2

    .line 18
    .line 19
    aget-object v5, v0, v4

    .line 20
    .line 21
    invoke-virtual {v5}, Ljava/lang/reflect/Field;->getModifiers()I

    .line 22
    .line 23
    .line 24
    move-result v6

    .line 25
    invoke-static {v6}, Ljava/lang/reflect/Modifier;->isTransient(I)Z

    .line 26
    .line 27
    .line 28
    move-result v6

    .line 29
    if-eqz v6, :cond_0

    .line 30
    .line 31
    goto :goto_1

    .line 32
    :cond_0
    invoke-virtual {v5}, Ljava/lang/reflect/Field;->getModifiers()I

    .line 33
    .line 34
    .line 35
    move-result v6

    .line 36
    invoke-static {v6}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 37
    .line 38
    .line 39
    move-result v6

    .line 40
    if-eqz v6, :cond_1

    .line 41
    .line 42
    goto :goto_1

    .line 43
    :cond_1
    invoke-virtual {v5}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object v6

    .line 47
    const/4 v7, 0x1

    .line 48
    :try_start_0
    invoke-virtual {v5, v7}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 49
    .line 50
    .line 51
    invoke-virtual {v5, p2}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object v7

    .line 55
    invoke-virtual {p0, p1, v7}, Lb8;->m(Lio/sentry/ILogger;Ljava/lang/Object;)Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object v7

    .line 59
    invoke-virtual {v1, v6, v7}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    invoke-virtual {v5, v3}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 63
    .line 64
    .line 65
    goto :goto_1

    .line 66
    :catch_0
    sget-object v5, Lio/sentry/s5;->INFO:Lio/sentry/s5;

    .line 67
    .line 68
    const-string v7, "Cannot access field "

    .line 69
    .line 70
    const-string v8, "."

    .line 71
    .line 72
    invoke-static {v7, v6, v8}, Lpc6;->p(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object v6

    .line 76
    new-array v7, v3, [Ljava/lang/Object;

    .line 77
    .line 78
    invoke-interface {p1, v5, v6, v7}, Lio/sentry/ILogger;->h(Lio/sentry/s5;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 79
    .line 80
    .line 81
    :goto_1
    add-int/lit8 v4, v4, 0x1

    .line 82
    .line 83
    goto :goto_0

    .line 84
    :cond_2
    return-object v1
.end method

.method public r(Lht4;Ld53;Ljava/util/Map;J)V
    .locals 5

    .line 1
    iget-object v0, p0, Lb8;->c:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/util/LinkedHashMap;

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    if-nez v1, :cond_0

    .line 10
    .line 11
    new-instance v1, Ljava/util/ArrayList;

    .line 12
    .line 13
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 14
    .line 15
    .line 16
    invoke-interface {v0, p1, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    :cond_0
    check-cast v1, Ljava/util/ArrayList;

    .line 20
    .line 21
    new-instance p1, Lg86;

    .line 22
    .line 23
    new-instance v0, Ljava/lang/ref/WeakReference;

    .line 24
    .line 25
    invoke-direct {v0, p2}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 26
    .line 27
    .line 28
    invoke-direct {p1, v0, p3, p4, p5}, Lg86;-><init>(Ljava/lang/ref/WeakReference;Ljava/util/Map;J)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    .line 32
    .line 33
    .line 34
    move-result p3

    .line 35
    if-eqz p3, :cond_1

    .line 36
    .line 37
    invoke-interface {v1, p1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    goto :goto_1

    .line 41
    :cond_1
    invoke-interface {v1}, Ljava/util/Collection;->size()I

    .line 42
    .line 43
    .line 44
    move-result p3

    .line 45
    const/4 v0, 0x0

    .line 46
    :goto_0
    if-ge v0, p3, :cond_4

    .line 47
    .line 48
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object v2

    .line 52
    check-cast v2, Lg86;

    .line 53
    .line 54
    iget-wide v3, v2, Lg86;->c:J

    .line 55
    .line 56
    cmp-long v3, p4, v3

    .line 57
    .line 58
    if-ltz v3, :cond_3

    .line 59
    .line 60
    iget-object p3, v2, Lg86;->a:Ljava/lang/ref/WeakReference;

    .line 61
    .line 62
    invoke-virtual {p3}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object p3

    .line 66
    if-ne p3, p2, :cond_2

    .line 67
    .line 68
    invoke-virtual {v1, v0, p1}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    goto :goto_1

    .line 72
    :cond_2
    invoke-virtual {v1, v0, p1}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 73
    .line 74
    .line 75
    goto :goto_1

    .line 76
    :cond_3
    add-int/lit8 v0, v0, 0x1

    .line 77
    .line 78
    goto :goto_0

    .line 79
    :cond_4
    :goto_1
    invoke-virtual {p0}, Lb8;->b()V

    .line 80
    .line 81
    .line 82
    return-void
.end method

.method public s(Ljava/lang/String;)V
    .locals 5

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    return-void

    .line 11
    :cond_0
    iget v1, p0, Lb8;->b:I

    .line 12
    .line 13
    invoke-virtual {p0, v1, v0}, Lb8;->f(II)V

    .line 14
    .line 15
    .line 16
    iget-object v1, p0, Lb8;->c:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast v1, [C

    .line 19
    .line 20
    iget v2, p0, Lb8;->b:I

    .line 21
    .line 22
    const/4 v3, 0x0

    .line 23
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 24
    .line 25
    .line 26
    move-result v4

    .line 27
    invoke-virtual {p1, v3, v4, v1, v2}, Ljava/lang/String;->getChars(II[CI)V

    .line 28
    .line 29
    .line 30
    iget p1, p0, Lb8;->b:I

    .line 31
    .line 32
    add-int/2addr p1, v0

    .line 33
    iput p1, p0, Lb8;->b:I

    .line 34
    .line 35
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 7

    .line 1
    iget-byte v0, p0, Lb8;->a:B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    sparse-switch v0, :sswitch_data_0

    .line 5
    .line 6
    .line 7
    invoke-super {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    return-object p0

    .line 12
    :sswitch_0
    new-instance v0, Ljava/lang/String;

    .line 13
    .line 14
    iget-object v2, p0, Lb8;->c:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast v2, [C

    .line 17
    .line 18
    iget p0, p0, Lb8;->b:I

    .line 19
    .line 20
    invoke-direct {v0, v2, v1, p0}, Ljava/lang/String;-><init>([CII)V

    .line 21
    .line 22
    .line 23
    return-object v0

    .line 24
    :sswitch_1
    sget-object v0, Lz33;->x:[I

    .line 25
    .line 26
    iget v2, p0, Lb8;->b:I

    .line 27
    .line 28
    ushr-int/lit8 v3, v2, 0x1c

    .line 29
    .line 30
    aget v0, v0, v3

    .line 31
    .line 32
    const-string v4, ""

    .line 33
    .line 34
    if-eqz v0, :cond_8

    .line 35
    .line 36
    const/4 v5, 0x1

    .line 37
    if-eq v0, v5, :cond_7

    .line 38
    .line 39
    const/4 v6, 0x2

    .line 40
    if-eq v0, v6, :cond_6

    .line 41
    .line 42
    const/4 v6, 0x7

    .line 43
    if-eq v0, v6, :cond_4

    .line 44
    .line 45
    const/16 v3, 0x8

    .line 46
    .line 47
    if-eq v0, v3, :cond_3

    .line 48
    .line 49
    const/16 v3, 0xe

    .line 50
    .line 51
    if-eq v0, v3, :cond_0

    .line 52
    .line 53
    const-string p0, "???"

    .line 54
    .line 55
    goto :goto_1

    .line 56
    :cond_0
    iget-object p0, p0, Lb8;->c:Ljava/lang/Object;

    .line 57
    .line 58
    check-cast p0, Lz33;

    .line 59
    .line 60
    invoke-virtual {p0, v2}, Lz33;->d(I)[I

    .line 61
    .line 62
    .line 63
    move-result-object p0

    .line 64
    if-eqz p0, :cond_2

    .line 65
    .line 66
    new-instance v0, Ljava/lang/StringBuilder;

    .line 67
    .line 68
    const-string v2, "["

    .line 69
    .line 70
    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 71
    .line 72
    .line 73
    array-length v2, p0

    .line 74
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 75
    .line 76
    .line 77
    const-string v2, "]{"

    .line 78
    .line 79
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 80
    .line 81
    .line 82
    array-length v2, p0

    .line 83
    if-eqz v2, :cond_1

    .line 84
    .line 85
    aget v1, p0, v1

    .line 86
    .line 87
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 88
    .line 89
    .line 90
    :goto_0
    array-length v1, p0

    .line 91
    if-ge v5, v1, :cond_1

    .line 92
    .line 93
    const-string v1, ", "

    .line 94
    .line 95
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 96
    .line 97
    .line 98
    aget v1, p0, v5

    .line 99
    .line 100
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 101
    .line 102
    .line 103
    add-int/lit8 v5, v5, 0x1

    .line 104
    .line 105
    goto :goto_0

    .line 106
    :cond_1
    const/16 p0, 0x7d

    .line 107
    .line 108
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 109
    .line 110
    .line 111
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 112
    .line 113
    .line 114
    move-result-object p0

    .line 115
    goto :goto_1

    .line 116
    :cond_2
    new-instance p0, Lbl8;

    .line 117
    .line 118
    invoke-direct {p0, v4}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 119
    .line 120
    .line 121
    throw p0

    .line 122
    :cond_3
    const-string p0, "(array)"

    .line 123
    .line 124
    goto :goto_1

    .line 125
    :cond_4
    if-ne v3, v6, :cond_5

    .line 126
    .line 127
    shl-int/lit8 p0, v2, 0x4

    .line 128
    .line 129
    shr-int/lit8 p0, p0, 0x4

    .line 130
    .line 131
    invoke-static {p0}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    .line 132
    .line 133
    .line 134
    move-result-object p0

    .line 135
    goto :goto_1

    .line 136
    :cond_5
    new-instance p0, Lbl8;

    .line 137
    .line 138
    invoke-direct {p0, v4}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 139
    .line 140
    .line 141
    throw p0

    .line 142
    :cond_6
    const-string p0, "(table)"

    .line 143
    .line 144
    goto :goto_1

    .line 145
    :cond_7
    const-string p0, "(binary blob)"

    .line 146
    .line 147
    goto :goto_1

    .line 148
    :cond_8
    iget-object p0, p0, Lb8;->c:Ljava/lang/Object;

    .line 149
    .line 150
    check-cast p0, Lz33;

    .line 151
    .line 152
    invoke-virtual {p0, v2}, Lz33;->g(I)Ljava/lang/String;

    .line 153
    .line 154
    .line 155
    move-result-object p0

    .line 156
    if-eqz p0, :cond_9

    .line 157
    .line 158
    :goto_1
    return-object p0

    .line 159
    :cond_9
    new-instance p0, Lbl8;

    .line 160
    .line 161
    invoke-direct {p0, v4}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 162
    .line 163
    .line 164
    throw p0

    .line 165
    :sswitch_data_0
    .sparse-switch
        0x3 -> :sswitch_1
        0x7 -> :sswitch_0
    .end sparse-switch
.end method
