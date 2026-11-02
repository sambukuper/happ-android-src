.class public abstract Lbd3;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# static fields
.field public static final synthetic a:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lfk2;

    .line 2
    .line 3
    const-string v1, "kotlin.jvm.JvmInline"

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lfk2;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0}, Lfk2;->b()Lfk2;

    .line 9
    .line 10
    .line 11
    iget-object v0, v0, Lfk2;->a:Lgk2;

    .line 12
    .line 13
    invoke-virtual {v0}, Lgk2;->g()Lv15;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    sget-object v1, Lfk2;->c:Lfk2;

    .line 18
    .line 19
    invoke-static {v0}, Lwl7;->h0(Lv15;)Lfk2;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    iget-object v0, v0, Lfk2;->a:Lgk2;

    .line 24
    .line 25
    invoke-virtual {v0}, Lgk2;->c()Z

    .line 26
    .line 27
    .line 28
    new-instance v0, Lfk2;

    .line 29
    .line 30
    const-string v1, "kotlin.jvm.JvmName"

    .line 31
    .line 32
    invoke-direct {v0, v1}, Lfk2;-><init>(Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    return-void
.end method

.method public static final a(Led1;)Z
    .locals 1

    .line 1
    instance-of v0, p0, Lsx4;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast p0, Lsx4;

    .line 6
    .line 7
    invoke-virtual {p0}, Lsx4;->u0()Lft8;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    instance-of p0, p0, Lad3;

    .line 12
    .line 13
    if-eqz p0, :cond_0

    .line 14
    .line 15
    const/4 p0, 0x1

    .line 16
    return p0

    .line 17
    :cond_0
    const/4 p0, 0x0

    .line 18
    return p0
.end method
