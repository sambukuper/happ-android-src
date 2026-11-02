.class public final Ltf7;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# static fields
.field public static final p:Lmx1;

.field public static final q:Lmx1;

.field public static final r:Lmx1;

.field public static final s:Lmx1;

.field public static final t:Lmx1;

.field public static final u:Lmx1;

.field public static final v:Lmx1;


# instance fields
.field public a:F

.field public b:F

.field public c:Z

.field public final d:Ljava/lang/Object;

.field public final e:Lys0;

.field public f:Z

.field public final g:F

.field public final h:F

.field public i:J

.field public j:F

.field public final k:Ljava/util/ArrayList;

.field public final l:Ljava/util/ArrayList;

.field public m:Luf7;

.field public n:F

.field public o:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lmx1;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-direct {v0, v1}, Lmx1;-><init>(B)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Ltf7;->p:Lmx1;

    .line 8
    .line 9
    new-instance v0, Lmx1;

    .line 10
    .line 11
    const/4 v1, 0x2

    .line 12
    invoke-direct {v0, v1}, Lmx1;-><init>(B)V

    .line 13
    .line 14
    .line 15
    sput-object v0, Ltf7;->q:Lmx1;

    .line 16
    .line 17
    new-instance v0, Lmx1;

    .line 18
    .line 19
    const/4 v1, 0x3

    .line 20
    invoke-direct {v0, v1}, Lmx1;-><init>(B)V

    .line 21
    .line 22
    .line 23
    sput-object v0, Ltf7;->r:Lmx1;

    .line 24
    .line 25
    new-instance v0, Lmx1;

    .line 26
    .line 27
    const/4 v1, 0x4

    .line 28
    invoke-direct {v0, v1}, Lmx1;-><init>(B)V

    .line 29
    .line 30
    .line 31
    sput-object v0, Ltf7;->s:Lmx1;

    .line 32
    .line 33
    new-instance v0, Lmx1;

    .line 34
    .line 35
    const/4 v1, 0x5

    .line 36
    invoke-direct {v0, v1}, Lmx1;-><init>(B)V

    .line 37
    .line 38
    .line 39
    sput-object v0, Ltf7;->t:Lmx1;

    .line 40
    .line 41
    new-instance v0, Lmx1;

    .line 42
    .line 43
    const/4 v1, 0x6

    .line 44
    invoke-direct {v0, v1}, Lmx1;-><init>(B)V

    .line 45
    .line 46
    .line 47
    sput-object v0, Ltf7;->u:Lmx1;

    .line 48
    .line 49
    new-instance v0, Lmx1;

    .line 50
    .line 51
    const/4 v1, 0x0

    .line 52
    invoke-direct {v0, v1}, Lmx1;-><init>(B)V

    .line 53
    .line 54
    .line 55
    sput-object v0, Ltf7;->v:Lmx1;

    .line 56
    .line 57
    return-void
.end method

.method public constructor <init>(Ljava/lang/Object;Lys0;)V
    .locals 4

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput v0, p0, Ltf7;->a:F

    .line 6
    .line 7
    const v0, 0x7f7fffff    # Float.MAX_VALUE

    .line 8
    .line 9
    .line 10
    iput v0, p0, Ltf7;->b:F

    .line 11
    .line 12
    const/4 v1, 0x0

    .line 13
    iput-boolean v1, p0, Ltf7;->c:Z

    .line 14
    .line 15
    iput-boolean v1, p0, Ltf7;->f:Z

    .line 16
    .line 17
    iput v0, p0, Ltf7;->g:F

    .line 18
    .line 19
    const v2, -0x800001

    .line 20
    .line 21
    .line 22
    iput v2, p0, Ltf7;->h:F

    .line 23
    .line 24
    const-wide/16 v2, 0x0

    .line 25
    .line 26
    iput-wide v2, p0, Ltf7;->i:J

    .line 27
    .line 28
    new-instance v2, Ljava/util/ArrayList;

    .line 29
    .line 30
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 31
    .line 32
    .line 33
    iput-object v2, p0, Ltf7;->k:Ljava/util/ArrayList;

    .line 34
    .line 35
    new-instance v2, Ljava/util/ArrayList;

    .line 36
    .line 37
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 38
    .line 39
    .line 40
    iput-object v2, p0, Ltf7;->l:Ljava/util/ArrayList;

    .line 41
    .line 42
    iput-object p1, p0, Ltf7;->d:Ljava/lang/Object;

    .line 43
    .line 44
    iput-object p2, p0, Ltf7;->e:Lys0;

    .line 45
    .line 46
    sget-object p1, Ltf7;->s:Lmx1;

    .line 47
    .line 48
    if-eq p2, p1, :cond_4

    .line 49
    .line 50
    sget-object p1, Ltf7;->t:Lmx1;

    .line 51
    .line 52
    if-eq p2, p1, :cond_4

    .line 53
    .line 54
    sget-object p1, Ltf7;->u:Lmx1;

    .line 55
    .line 56
    if-ne p2, p1, :cond_0

    .line 57
    .line 58
    goto :goto_1

    .line 59
    :cond_0
    sget-object p1, Ltf7;->v:Lmx1;

    .line 60
    .line 61
    if-ne p2, p1, :cond_1

    .line 62
    .line 63
    const/high16 p1, 0x3b800000    # 0.00390625f

    .line 64
    .line 65
    iput p1, p0, Ltf7;->j:F

    .line 66
    .line 67
    goto :goto_2

    .line 68
    :cond_1
    sget-object p1, Ltf7;->q:Lmx1;

    .line 69
    .line 70
    if-eq p2, p1, :cond_3

    .line 71
    .line 72
    sget-object p1, Ltf7;->r:Lmx1;

    .line 73
    .line 74
    if-ne p2, p1, :cond_2

    .line 75
    .line 76
    goto :goto_0

    .line 77
    :cond_2
    const/high16 p1, 0x3f800000    # 1.0f

    .line 78
    .line 79
    iput p1, p0, Ltf7;->j:F

    .line 80
    .line 81
    goto :goto_2

    .line 82
    :cond_3
    :goto_0
    const p1, 0x3b03126f    # 0.002f

    .line 83
    .line 84
    .line 85
    iput p1, p0, Ltf7;->j:F

    .line 86
    .line 87
    goto :goto_2

    .line 88
    :cond_4
    :goto_1
    const p1, 0x3dcccccd    # 0.1f

    .line 89
    .line 90
    .line 91
    iput p1, p0, Ltf7;->j:F

    .line 92
    .line 93
    :goto_2
    const/4 p1, 0x0

    .line 94
    iput-object p1, p0, Ltf7;->m:Luf7;

    .line 95
    .line 96
    iput v0, p0, Ltf7;->n:F

    .line 97
    .line 98
    iput-boolean v1, p0, Ltf7;->o:Z

    .line 99
    .line 100
    return-void
.end method

.method public static c()Llk;
    .locals 4

    .line 1
    sget-object v0, Llk;->i:Ljava/lang/ThreadLocal;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    if-nez v1, :cond_0

    .line 8
    .line 9
    new-instance v1, Llk;

    .line 10
    .line 11
    new-instance v2, Ldq;

    .line 12
    .line 13
    const/16 v3, 0xc

    .line 14
    .line 15
    invoke-direct {v2, v3}, Ldq;-><init>(B)V

    .line 16
    .line 17
    .line 18
    invoke-direct {v1, v2}, Llk;-><init>(Ldq;)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0, v1}, Ljava/lang/ThreadLocal;->set(Ljava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    :cond_0
    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    check-cast v0, Llk;

    .line 29
    .line 30
    return-object v0
.end method


# virtual methods
.method public final a(F)V
    .locals 3

    .line 1
    iget-boolean v0, p0, Ltf7;->f:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iput p1, p0, Ltf7;->n:F

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    iget-object v0, p0, Ltf7;->m:Luf7;

    .line 9
    .line 10
    if-nez v0, :cond_1

    .line 11
    .line 12
    new-instance v0, Luf7;

    .line 13
    .line 14
    invoke-direct {v0, p1}, Luf7;-><init>(F)V

    .line 15
    .line 16
    .line 17
    iput-object v0, p0, Ltf7;->m:Luf7;

    .line 18
    .line 19
    :cond_1
    float-to-double v1, p1

    .line 20
    iput-wide v1, v0, Luf7;->i:D

    .line 21
    .line 22
    invoke-virtual {p0}, Ltf7;->g()V

    .line 23
    .line 24
    .line 25
    return-void
.end method

.method public final b(Z)V
    .locals 8

    .line 1
    const/4 p1, 0x0

    .line 2
    iput-boolean p1, p0, Ltf7;->f:Z

    .line 3
    .line 4
    invoke-static {}, Ltf7;->c()Llk;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    iget-object v1, v0, Llk;->a:Ll97;

    .line 9
    .line 10
    invoke-virtual {v1, p0}, Ll97;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    iget-object v1, v0, Llk;->b:Ljava/util/ArrayList;

    .line 14
    .line 15
    invoke-virtual {v1, p0}, Ljava/util/ArrayList;->indexOf(Ljava/lang/Object;)I

    .line 16
    .line 17
    .line 18
    move-result v2

    .line 19
    const/4 v3, 0x1

    .line 20
    if-ltz v2, :cond_0

    .line 21
    .line 22
    const/4 v4, 0x0

    .line 23
    invoke-virtual {v1, v2, v4}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    iput-boolean v3, v0, Llk;->f:Z

    .line 27
    .line 28
    :cond_0
    const-wide/16 v0, 0x0

    .line 29
    .line 30
    iput-wide v0, p0, Ltf7;->i:J

    .line 31
    .line 32
    iput-boolean p1, p0, Ltf7;->c:Z

    .line 33
    .line 34
    :goto_0
    iget-object v0, p0, Ltf7;->k:Ljava/util/ArrayList;

    .line 35
    .line 36
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 37
    .line 38
    .line 39
    move-result v1

    .line 40
    if-ge p1, v1, :cond_4

    .line 41
    .line 42
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object v1

    .line 46
    if-eqz v1, :cond_3

    .line 47
    .line 48
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    check-cast v0, Lg20;

    .line 53
    .line 54
    iget-object v0, v0, Lg20;->a:Lcom/google/android/material/progressindicator/a;

    .line 55
    .line 56
    invoke-virtual {v0}, Lcom/google/android/material/progressindicator/a;->getProgressDrawable()Lpm1;

    .line 57
    .line 58
    .line 59
    move-result-object v1

    .line 60
    if-eqz v1, :cond_3

    .line 61
    .line 62
    invoke-virtual {v0}, Lcom/google/android/material/progressindicator/a;->getProgressDrawable()Lpm1;

    .line 63
    .line 64
    .line 65
    move-result-object v1

    .line 66
    invoke-virtual {v1}, Landroid/graphics/drawable/Drawable;->getLevel()I

    .line 67
    .line 68
    .line 69
    move-result v1

    .line 70
    const/16 v2, 0x2710

    .line 71
    .line 72
    if-ne v1, v2, :cond_3

    .line 73
    .line 74
    iget-object v1, v0, Lcom/google/android/material/progressindicator/a;->r0:Lh20;

    .line 75
    .line 76
    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    .line 77
    .line 78
    .line 79
    move-result v2

    .line 80
    if-eqz v2, :cond_1

    .line 81
    .line 82
    iget-object v1, v0, Lcom/google/android/material/progressindicator/a;->q0:Lh20;

    .line 83
    .line 84
    invoke-virtual {v0, v1}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 85
    .line 86
    .line 87
    goto :goto_1

    .line 88
    :cond_1
    invoke-virtual {v0, v1}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 89
    .line 90
    .line 91
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    .line 92
    .line 93
    .line 94
    move-result-wide v4

    .line 95
    iget-wide v6, v0, Lcom/google/android/material/progressindicator/a;->k0:J

    .line 96
    .line 97
    sub-long/2addr v4, v6

    .line 98
    iget v2, v0, Lcom/google/android/material/progressindicator/a;->j0:I

    .line 99
    .line 100
    int-to-long v6, v2

    .line 101
    cmp-long v2, v4, v6

    .line 102
    .line 103
    if-ltz v2, :cond_2

    .line 104
    .line 105
    invoke-virtual {v1}, Lh20;->run()V

    .line 106
    .line 107
    .line 108
    goto :goto_1

    .line 109
    :cond_2
    sub-long/2addr v6, v4

    .line 110
    invoke-virtual {v0, v1, v6, v7}, Landroid/view/View;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 111
    .line 112
    .line 113
    :cond_3
    :goto_1
    add-int/lit8 p1, p1, 0x1

    .line 114
    .line 115
    goto :goto_0

    .line 116
    :cond_4
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 117
    .line 118
    .line 119
    move-result p0

    .line 120
    sub-int/2addr p0, v3

    .line 121
    :goto_2
    if-ltz p0, :cond_6

    .line 122
    .line 123
    invoke-virtual {v0, p0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 124
    .line 125
    .line 126
    move-result-object p1

    .line 127
    if-nez p1, :cond_5

    .line 128
    .line 129
    invoke-virtual {v0, p0}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 130
    .line 131
    .line 132
    :cond_5
    add-int/lit8 p0, p0, -0x1

    .line 133
    .line 134
    goto :goto_2

    .line 135
    :cond_6
    return-void
.end method

.method public final d(F)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    cmpg-float v0, p1, v0

    .line 3
    .line 4
    if-lez v0, :cond_0

    .line 5
    .line 6
    iput p1, p0, Ltf7;->j:F

    .line 7
    .line 8
    return-void

    .line 9
    :cond_0
    const-string p0, "Minimum visible change must be positive."

    .line 10
    .line 11
    invoke-static {p0}, Lbt;->q(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public final e(F)V
    .locals 2

    .line 1
    iget-object v0, p0, Ltf7;->e:Lys0;

    .line 2
    .line 3
    iget-object v1, p0, Ltf7;->d:Ljava/lang/Object;

    .line 4
    .line 5
    invoke-virtual {v0, v1, p1}, Lys0;->U(Ljava/lang/Object;F)V

    .line 6
    .line 7
    .line 8
    const/4 p1, 0x0

    .line 9
    :goto_0
    iget-object v0, p0, Ltf7;->l:Ljava/util/ArrayList;

    .line 10
    .line 11
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    if-ge p1, v1, :cond_1

    .line 16
    .line 17
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    if-nez v1, :cond_0

    .line 22
    .line 23
    add-int/lit8 p1, p1, 0x1

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    check-cast p0, Lvd8;

    .line 31
    .line 32
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 33
    .line 34
    .line 35
    const/4 p0, 0x0

    .line 36
    throw p0

    .line 37
    :cond_1
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 38
    .line 39
    .line 40
    move-result p0

    .line 41
    add-int/lit8 p0, p0, -0x1

    .line 42
    .line 43
    :goto_1
    if-ltz p0, :cond_3

    .line 44
    .line 45
    invoke-virtual {v0, p0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    if-nez p1, :cond_2

    .line 50
    .line 51
    invoke-virtual {v0, p0}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    :cond_2
    add-int/lit8 p0, p0, -0x1

    .line 55
    .line 56
    goto :goto_1

    .line 57
    :cond_3
    return-void
.end method

.method public final f()V
    .locals 4

    .line 1
    iget-object v0, p0, Ltf7;->m:Luf7;

    .line 2
    .line 3
    iget-wide v0, v0, Luf7;->b:D

    .line 4
    .line 5
    const-wide/16 v2, 0x0

    .line 6
    .line 7
    cmpl-double v0, v0, v2

    .line 8
    .line 9
    if-lez v0, :cond_2

    .line 10
    .line 11
    invoke-static {}, Ltf7;->c()Llk;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-virtual {v0}, Llk;->b()Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-eqz v0, :cond_1

    .line 20
    .line 21
    iget-boolean v0, p0, Ltf7;->f:Z

    .line 22
    .line 23
    if-eqz v0, :cond_0

    .line 24
    .line 25
    const/4 v0, 0x1

    .line 26
    iput-boolean v0, p0, Ltf7;->o:Z

    .line 27
    .line 28
    :cond_0
    return-void

    .line 29
    :cond_1
    new-instance p0, Landroid/util/AndroidRuntimeException;

    .line 30
    .line 31
    const-string v0, "Animations may only be started on the same thread as the animation handler"

    .line 32
    .line 33
    invoke-direct {p0, v0}, Landroid/util/AndroidRuntimeException;-><init>(Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    throw p0

    .line 37
    :cond_2
    const-string p0, "Spring animations can only come to an end when there is damping"

    .line 38
    .line 39
    invoke-static {p0}, Lu52;->k(Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    return-void
.end method

.method public final g()V
    .locals 7

    .line 1
    iget-object v0, p0, Ltf7;->m:Luf7;

    .line 2
    .line 3
    if-eqz v0, :cond_6

    .line 4
    .line 5
    iget-wide v1, v0, Luf7;->i:D

    .line 6
    .line 7
    double-to-float v1, v1

    .line 8
    float-to-double v1, v1

    .line 9
    iget v3, p0, Ltf7;->g:F

    .line 10
    .line 11
    float-to-double v4, v3

    .line 12
    cmpl-double v4, v1, v4

    .line 13
    .line 14
    if-gtz v4, :cond_5

    .line 15
    .line 16
    iget v4, p0, Ltf7;->h:F

    .line 17
    .line 18
    float-to-double v5, v4

    .line 19
    cmpg-double v1, v1, v5

    .line 20
    .line 21
    if-ltz v1, :cond_4

    .line 22
    .line 23
    iget v1, p0, Ltf7;->j:F

    .line 24
    .line 25
    const/high16 v2, 0x3f400000    # 0.75f

    .line 26
    .line 27
    mul-float/2addr v1, v2

    .line 28
    float-to-double v1, v1

    .line 29
    invoke-static {v1, v2}, Ljava/lang/Math;->abs(D)D

    .line 30
    .line 31
    .line 32
    move-result-wide v1

    .line 33
    iput-wide v1, v0, Luf7;->d:D

    .line 34
    .line 35
    const-wide v5, 0x404f400000000000L    # 62.5

    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    mul-double/2addr v1, v5

    .line 41
    iput-wide v1, v0, Luf7;->e:D

    .line 42
    .line 43
    invoke-static {}, Ltf7;->c()Llk;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    invoke-virtual {v0}, Llk;->b()Z

    .line 48
    .line 49
    .line 50
    move-result v0

    .line 51
    if-eqz v0, :cond_3

    .line 52
    .line 53
    iget-boolean v0, p0, Ltf7;->f:Z

    .line 54
    .line 55
    if-nez v0, :cond_2

    .line 56
    .line 57
    if-nez v0, :cond_2

    .line 58
    .line 59
    const/4 v0, 0x1

    .line 60
    iput-boolean v0, p0, Ltf7;->f:Z

    .line 61
    .line 62
    iget-boolean v0, p0, Ltf7;->c:Z

    .line 63
    .line 64
    if-nez v0, :cond_0

    .line 65
    .line 66
    iget-object v0, p0, Ltf7;->e:Lys0;

    .line 67
    .line 68
    iget-object v1, p0, Ltf7;->d:Ljava/lang/Object;

    .line 69
    .line 70
    invoke-virtual {v0, v1}, Lys0;->E(Ljava/lang/Object;)F

    .line 71
    .line 72
    .line 73
    move-result v0

    .line 74
    iput v0, p0, Ltf7;->b:F

    .line 75
    .line 76
    :cond_0
    iget v0, p0, Ltf7;->b:F

    .line 77
    .line 78
    cmpl-float v1, v0, v3

    .line 79
    .line 80
    if-gtz v1, :cond_1

    .line 81
    .line 82
    cmpg-float v0, v0, v4

    .line 83
    .line 84
    if-ltz v0, :cond_1

    .line 85
    .line 86
    invoke-static {}, Ltf7;->c()Llk;

    .line 87
    .line 88
    .line 89
    move-result-object v0

    .line 90
    invoke-virtual {v0, p0}, Llk;->a(Ltf7;)V

    .line 91
    .line 92
    .line 93
    return-void

    .line 94
    :cond_1
    const-string p0, "Starting value need to be in between min value and max value"

    .line 95
    .line 96
    invoke-static {p0}, Lbt;->q(Ljava/lang/String;)V

    .line 97
    .line 98
    .line 99
    :cond_2
    return-void

    .line 100
    :cond_3
    new-instance p0, Landroid/util/AndroidRuntimeException;

    .line 101
    .line 102
    const-string v0, "Animations may only be started on the same thread as the animation handler"

    .line 103
    .line 104
    invoke-direct {p0, v0}, Landroid/util/AndroidRuntimeException;-><init>(Ljava/lang/String;)V

    .line 105
    .line 106
    .line 107
    throw p0

    .line 108
    :cond_4
    const-string p0, "Final position of the spring cannot be less than the min value."

    .line 109
    .line 110
    invoke-static {p0}, Lu52;->k(Ljava/lang/String;)V

    .line 111
    .line 112
    .line 113
    return-void

    .line 114
    :cond_5
    const-string p0, "Final position of the spring cannot be greater than the max value."

    .line 115
    .line 116
    invoke-static {p0}, Lu52;->k(Ljava/lang/String;)V

    .line 117
    .line 118
    .line 119
    return-void

    .line 120
    :cond_6
    const-string p0, "Incomplete SpringAnimation: Either final position or a spring force needs to be set."

    .line 121
    .line 122
    invoke-static {p0}, Lu52;->k(Ljava/lang/String;)V

    .line 123
    .line 124
    .line 125
    return-void
.end method
