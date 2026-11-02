.class public final synthetic Lhp;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Ld41;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, Lhp;->a:B

    .line 2
    .line 3
    iput-object p1, p0, Lhp;->b:Ljava/lang/Object;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;)V
    .locals 4

    .line 1
    iget-byte v0, p0, Lhp;->a:B

    .line 2
    .line 3
    iget-object p0, p0, Lhp;->b:Ljava/lang/Object;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    check-cast p0, Lqd0;

    .line 9
    .line 10
    check-cast p1, Llz;

    .line 11
    .line 12
    invoke-virtual {p0, p1}, Lqd0;->b(Ljava/lang/Object;)Z

    .line 13
    .line 14
    .line 15
    return-void

    .line 16
    :pswitch_0
    check-cast p0, Lmf1;

    .line 17
    .line 18
    check-cast p1, Llz;

    .line 19
    .line 20
    const-string p1, "SurfaceViewImpl"

    .line 21
    .line 22
    invoke-static {p1}, Lhi5;->z0(Ljava/lang/String;)Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    if-eqz p0, :cond_0

    .line 26
    .line 27
    invoke-virtual {p0}, Lmf1;->c()V

    .line 28
    .line 29
    .line 30
    :cond_0
    return-void

    .line 31
    :pswitch_1
    check-cast p0, Ljava/util/Map;

    .line 32
    .line 33
    check-cast p1, Lmz;

    .line 34
    .line 35
    invoke-interface {p0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    invoke-interface {p0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 44
    .line 45
    .line 46
    move-result v0

    .line 47
    if-eqz v0, :cond_2

    .line 48
    .line 49
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    check-cast v0, Ljava/util/Map$Entry;

    .line 54
    .line 55
    iget v1, p1, Lmz;->b:I

    .line 56
    .line 57
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object v2

    .line 61
    check-cast v2, Lxy;

    .line 62
    .line 63
    iget v2, v2, Lxy;->f:I

    .line 64
    .line 65
    sub-int/2addr v1, v2

    .line 66
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object v2

    .line 70
    check-cast v2, Lxy;

    .line 71
    .line 72
    iget-boolean v2, v2, Lxy;->g:Z

    .line 73
    .line 74
    if-eqz v2, :cond_1

    .line 75
    .line 76
    neg-int v1, v1

    .line 77
    :cond_1
    invoke-static {v1}, Lhd8;->i(I)I

    .line 78
    .line 79
    .line 80
    move-result v1

    .line 81
    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object v0

    .line 85
    check-cast v0, Lxx7;

    .line 86
    .line 87
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 88
    .line 89
    .line 90
    new-instance v2, Lvx7;

    .line 91
    .line 92
    const/4 v3, -0x1

    .line 93
    invoke-direct {v2, v0, v1, v3}, Lvx7;-><init>(Lxx7;II)V

    .line 94
    .line 95
    .line 96
    invoke-static {v2}, Ls08;->g(Ljava/lang/Runnable;)V

    .line 97
    .line 98
    .line 99
    goto :goto_0

    .line 100
    :cond_2
    return-void

    .line 101
    :pswitch_2
    check-cast p0, Landroidx/appcompat/widget/AppCompatTextView;

    .line 102
    .line 103
    check-cast p1, Landroid/graphics/Typeface;

    .line 104
    .line 105
    invoke-static {p0, p1}, Landroidx/appcompat/widget/AppCompatTextView;->g(Landroidx/appcompat/widget/AppCompatTextView;Landroid/graphics/Typeface;)V

    .line 106
    .line 107
    .line 108
    return-void

    .line 109
    :pswitch_3
    check-cast p0, Landroidx/appcompat/widget/AppCompatEditText;

    .line 110
    .line 111
    check-cast p1, Landroid/graphics/Typeface;

    .line 112
    .line 113
    invoke-static {p0, p1}, Landroidx/appcompat/widget/AppCompatEditText;->a(Landroidx/appcompat/widget/AppCompatEditText;Landroid/graphics/Typeface;)V

    .line 114
    .line 115
    .line 116
    return-void

    .line 117
    :pswitch_4
    check-cast p0, Landroidx/appcompat/widget/AppCompatButton;

    .line 118
    .line 119
    check-cast p1, Landroid/graphics/Typeface;

    .line 120
    .line 121
    invoke-static {p0, p1}, Landroidx/appcompat/widget/AppCompatButton;->a(Landroidx/appcompat/widget/AppCompatButton;Landroid/graphics/Typeface;)V

    .line 122
    .line 123
    .line 124
    return-void

    .line 125
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
