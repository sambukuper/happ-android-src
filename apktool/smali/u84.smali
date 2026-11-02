.class public final Lu84;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements La94;
.implements Lb71;


# instance fields
.field public final X:Lg94;

.field public final Y:Ls61;


# direct methods
.method public constructor <init>(Lg94;Ls61;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object p1, p0, Lu84;->X:Lg94;

    .line 11
    .line 12
    iput-object p2, p0, Lu84;->Y:Ls61;

    .line 13
    .line 14
    iget-object p0, p1, Lg94;->i:Lo84;

    .line 15
    .line 16
    sget-object p1, Lo84;->X:Lo84;

    .line 17
    .line 18
    if-ne p0, p1, :cond_0

    .line 19
    .line 20
    const/4 p0, 0x0

    .line 21
    invoke-static {p2, p0}, Lu70;->x(Ls61;Ljava/util/concurrent/CancellationException;)V

    .line 22
    .line 23
    .line 24
    :cond_0
    return-void
.end method


# virtual methods
.method public final getCoroutineContext()Ls61;
    .locals 0

    .line 1
    iget-object p0, p0, Lu84;->Y:Ls61;

    .line 2
    .line 3
    return-object p0
.end method

.method public final k(Ld94;Ln84;)V
    .locals 1

    .line 1
    iget-object p1, p0, Lu84;->X:Lg94;

    .line 2
    .line 3
    iget-object p2, p1, Lg94;->i:Lo84;

    .line 4
    .line 5
    sget-object v0, Lo84;->X:Lo84;

    .line 6
    .line 7
    invoke-virtual {p2, v0}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    .line 8
    .line 9
    .line 10
    move-result p2

    .line 11
    if-gtz p2, :cond_0

    .line 12
    .line 13
    invoke-virtual {p1, p0}, Lg94;->f(Lc94;)V

    .line 14
    .line 15
    .line 16
    iget-object p0, p0, Lu84;->Y:Ls61;

    .line 17
    .line 18
    const/4 p1, 0x0

    .line 19
    invoke-static {p0, p1}, Lu70;->x(Ls61;Ljava/util/concurrent/CancellationException;)V

    .line 20
    .line 21
    .line 22
    :cond_0
    return-void
.end method
