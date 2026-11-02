.class public final Lv71;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lae8;


# instance fields
.field public final a:Lke8;

.field public final b:Lc73;

.field public final c:I


# direct methods
.method public constructor <init>(Lke8;Lc73;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lv71;->a:Lke8;

    .line 5
    .line 6
    iput-object p2, p0, Lv71;->b:Lc73;

    .line 7
    .line 8
    iput p3, p0, Lv71;->c:I

    .line 9
    .line 10
    if-lez p3, :cond_0

    .line 11
    .line 12
    return-void

    .line 13
    :cond_0
    const-string p0, "durationMillis must be > 0."

    .line 14
    .line 15
    invoke-static {p0}, Lbt;->q(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    const/4 p0, 0x0

    .line 19
    throw p0
.end method


# virtual methods
.method public final a()V
    .locals 9

    .line 1
    new-instance v0, Lr71;

    .line 2
    .line 3
    iget-object v6, p0, Lv71;->a:Lke8;

    .line 4
    .line 5
    invoke-interface {v6}, Lke8;->getDrawable()Landroid/graphics/drawable/Drawable;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    iget-object v7, p0, Lv71;->b:Lc73;

    .line 10
    .line 11
    invoke-interface {v7}, Lc73;->a()Ld53;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    if-eqz v2, :cond_0

    .line 16
    .line 17
    invoke-interface {v6}, Lke8;->getView()Landroid/view/View;

    .line 18
    .line 19
    .line 20
    move-result-object v3

    .line 21
    invoke-virtual {v3}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 22
    .line 23
    .line 24
    move-result-object v3

    .line 25
    invoke-static {v2, v3}, Lz39;->g(Ld53;Landroid/content/res/Resources;)Landroid/graphics/drawable/Drawable;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    goto :goto_0

    .line 30
    :cond_0
    const/4 v2, 0x0

    .line 31
    :goto_0
    invoke-interface {v7}, Lc73;->getRequest()Lv63;

    .line 32
    .line 33
    .line 34
    move-result-object v3

    .line 35
    iget-object v3, v3, Lv63;->p:Lpw6;

    .line 36
    .line 37
    instance-of v8, v7, Ljw7;

    .line 38
    .line 39
    if-eqz v8, :cond_2

    .line 40
    .line 41
    move-object v4, v7

    .line 42
    check-cast v4, Ljw7;

    .line 43
    .line 44
    iget-boolean v4, v4, Ljw7;->g:Z

    .line 45
    .line 46
    if-nez v4, :cond_1

    .line 47
    .line 48
    goto :goto_2

    .line 49
    :cond_1
    const/4 v4, 0x0

    .line 50
    :goto_1
    move v5, v4

    .line 51
    goto :goto_3

    .line 52
    :cond_2
    :goto_2
    const/4 v4, 0x1

    .line 53
    goto :goto_1

    .line 54
    :goto_3
    iget v4, p0, Lv71;->c:I

    .line 55
    .line 56
    invoke-direct/range {v0 .. v5}, Lr71;-><init>(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Lpw6;IZ)V

    .line 57
    .line 58
    .line 59
    if-eqz v8, :cond_3

    .line 60
    .line 61
    invoke-static {v0}, Lz39;->h(Landroid/graphics/drawable/Drawable;)Ld53;

    .line 62
    .line 63
    .line 64
    move-result-object p0

    .line 65
    invoke-interface {v6, p0}, Lr18;->onSuccess(Ld53;)V

    .line 66
    .line 67
    .line 68
    return-void

    .line 69
    :cond_3
    instance-of p0, v7, Lm32;

    .line 70
    .line 71
    if-eqz p0, :cond_4

    .line 72
    .line 73
    invoke-static {v0}, Lz39;->h(Landroid/graphics/drawable/Drawable;)Ld53;

    .line 74
    .line 75
    .line 76
    move-result-object p0

    .line 77
    invoke-interface {v6, p0}, Lr18;->onError(Ld53;)V

    .line 78
    .line 79
    .line 80
    return-void

    .line 81
    :cond_4
    invoke-static {}, Lb61;->c()V

    .line 82
    .line 83
    .line 84
    return-void
.end method
