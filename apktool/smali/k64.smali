.class public final Lk64;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# instance fields
.field public final a:Ljava/lang/Object;

.field public final b:Lm64;

.field public c:I

.field public d:I

.field public e:Lk64;

.field public f:Z

.field public final g:Lrh5;


# direct methods
.method public constructor <init>(Ljava/lang/Object;Lm64;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lk64;->a:Ljava/lang/Object;

    .line 5
    .line 6
    iput-object p2, p0, Lk64;->b:Lm64;

    .line 7
    .line 8
    const/4 p1, -0x1

    .line 9
    iput p1, p0, Lk64;->c:I

    .line 10
    .line 11
    const/4 p1, 0x0

    .line 12
    invoke-static {p1}, Lz51;->H(Ljava/lang/Object;)Lrh5;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    iput-object p1, p0, Lk64;->g:Lrh5;

    .line 17
    .line 18
    return-void
.end method


# virtual methods
.method public final a()Lk64;
    .locals 1

    .line 1
    iget-boolean v0, p0, Lk64;->f:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const-string v0, "Pin should not be called on an already disposed item "

    .line 6
    .line 7
    invoke-static {v0}, Lzc3;->c(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    :cond_0
    iget v0, p0, Lk64;->d:I

    .line 11
    .line 12
    if-nez v0, :cond_2

    .line 13
    .line 14
    iget-object v0, p0, Lk64;->b:Lm64;

    .line 15
    .line 16
    iget-object v0, v0, Lm64;->X:Lvd7;

    .line 17
    .line 18
    invoke-virtual {v0, p0}, Lvd7;->add(Ljava/lang/Object;)Z

    .line 19
    .line 20
    .line 21
    iget-object v0, p0, Lk64;->g:Lrh5;

    .line 22
    .line 23
    invoke-virtual {v0}, Lrh5;->getValue()Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    check-cast v0, Lk64;

    .line 28
    .line 29
    if-eqz v0, :cond_1

    .line 30
    .line 31
    invoke-virtual {v0}, Lk64;->a()Lk64;

    .line 32
    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_1
    const/4 v0, 0x0

    .line 36
    :goto_0
    iput-object v0, p0, Lk64;->e:Lk64;

    .line 37
    .line 38
    :cond_2
    iget v0, p0, Lk64;->d:I

    .line 39
    .line 40
    add-int/lit8 v0, v0, 0x1

    .line 41
    .line 42
    iput v0, p0, Lk64;->d:I

    .line 43
    .line 44
    return-object p0
.end method

.method public final b()V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lk64;->f:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    goto :goto_1

    .line 6
    :cond_0
    iget v0, p0, Lk64;->d:I

    .line 7
    .line 8
    if-lez v0, :cond_1

    .line 9
    .line 10
    goto :goto_0

    .line 11
    :cond_1
    const-string v0, "Release should only be called once"

    .line 12
    .line 13
    invoke-static {v0}, Lzc3;->c(Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    :goto_0
    iget v0, p0, Lk64;->d:I

    .line 17
    .line 18
    add-int/lit8 v0, v0, -0x1

    .line 19
    .line 20
    iput v0, p0, Lk64;->d:I

    .line 21
    .line 22
    if-nez v0, :cond_2

    .line 23
    .line 24
    invoke-virtual {p0}, Lk64;->c()V

    .line 25
    .line 26
    .line 27
    :cond_2
    :goto_1
    return-void
.end method

.method public final c()V
    .locals 1

    .line 1
    iget-object v0, p0, Lk64;->b:Lm64;

    .line 2
    .line 3
    iget-object v0, v0, Lm64;->X:Lvd7;

    .line 4
    .line 5
    invoke-virtual {v0, p0}, Lvd7;->remove(Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Lk64;->e:Lk64;

    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    invoke-virtual {v0}, Lk64;->b()V

    .line 13
    .line 14
    .line 15
    :cond_0
    const/4 v0, 0x0

    .line 16
    iput-object v0, p0, Lk64;->e:Lk64;

    .line 17
    .line 18
    return-void
.end method
