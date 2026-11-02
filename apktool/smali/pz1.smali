.class public final Lpz1;
.super Lyn0;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# instance fields
.field public final j:Loz1;


# direct methods
.method public constructor <init>(Landroid/widget/TextView;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Loz1;

    .line 5
    .line 6
    invoke-direct {v0, p1}, Loz1;-><init>(Landroid/widget/TextView;)V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lpz1;->j:Loz1;

    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final E([Landroid/text/InputFilter;)[Landroid/text/InputFilter;
    .locals 1

    .line 1
    invoke-static {}, Lyy1;->d()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    return-object p1

    .line 8
    :cond_0
    iget-object p0, p0, Lpz1;->j:Loz1;

    .line 9
    .line 10
    invoke-virtual {p0, p1}, Loz1;->E([Landroid/text/InputFilter;)[Landroid/text/InputFilter;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    return-object p0
.end method

.method public final M()Z
    .locals 0

    .line 1
    iget-object p0, p0, Lpz1;->j:Loz1;

    .line 2
    .line 3
    iget-boolean p0, p0, Loz1;->l:Z

    .line 4
    .line 5
    return p0
.end method

.method public final d0(Z)V
    .locals 1

    .line 1
    invoke-static {}, Lyy1;->d()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    iget-object p0, p0, Lpz1;->j:Loz1;

    .line 9
    .line 10
    invoke-virtual {p0, p1}, Loz1;->d0(Z)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public final f0(Z)V
    .locals 1

    .line 1
    invoke-static {}, Lyy1;->d()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    iget-object p0, p0, Lpz1;->j:Loz1;

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    iput-boolean p1, p0, Loz1;->l:Z

    .line 10
    .line 11
    return-void

    .line 12
    :cond_0
    invoke-virtual {p0, p1}, Loz1;->f0(Z)V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public final i0(Landroid/text/method/TransformationMethod;)Landroid/text/method/TransformationMethod;
    .locals 1

    .line 1
    invoke-static {}, Lyy1;->d()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    return-object p1

    .line 8
    :cond_0
    iget-object p0, p0, Lpz1;->j:Loz1;

    .line 9
    .line 10
    invoke-virtual {p0, p1}, Loz1;->i0(Landroid/text/method/TransformationMethod;)Landroid/text/method/TransformationMethod;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    return-object p0
.end method
