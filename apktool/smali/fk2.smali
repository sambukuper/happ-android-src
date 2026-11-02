.class public final Lfk2;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# static fields
.field public static final c:Lfk2;


# instance fields
.field public final a:Lgk2;

.field public transient b:Lfk2;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lfk2;

    .line 2
    .line 3
    const-string v1, ""

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lfk2;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    sput-object v0, Lfk2;->c:Lfk2;

    .line 9
    .line 10
    return-void
.end method

.method public constructor <init>(Lgk2;)V
    .locals 0

    .line 15
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 16
    iput-object p1, p0, Lfk2;->a:Lgk2;

    return-void
.end method

.method public constructor <init>(Lgk2;Lfk2;)V
    .locals 0

    .line 17
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 18
    iput-object p1, p0, Lfk2;->a:Lgk2;

    .line 19
    iput-object p2, p0, Lfk2;->b:Lfk2;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    new-instance v0, Lgk2;

    .line 8
    .line 9
    invoke-direct {v0, p0, p1}, Lgk2;-><init>(Lfk2;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    iput-object v0, p0, Lfk2;->a:Lgk2;

    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final a(Lv15;)Lfk2;
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance v0, Lfk2;

    .line 5
    .line 6
    iget-object v1, p0, Lfk2;->a:Lgk2;

    .line 7
    .line 8
    invoke-virtual {v1, p1}, Lgk2;->a(Lv15;)Lgk2;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    invoke-direct {v0, p1, p0}, Lfk2;-><init>(Lgk2;Lfk2;)V

    .line 13
    .line 14
    .line 15
    return-object v0
.end method

.method public final b()Lfk2;
    .locals 2

    .line 1
    iget-object v0, p0, Lfk2;->b:Lfk2;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-object v0

    .line 6
    :cond_0
    iget-object v0, p0, Lfk2;->a:Lgk2;

    .line 7
    .line 8
    invoke-virtual {v0}, Lgk2;->c()Z

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    if-nez v1, :cond_1

    .line 13
    .line 14
    new-instance v1, Lfk2;

    .line 15
    .line 16
    invoke-virtual {v0}, Lgk2;->e()Lgk2;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    invoke-direct {v1, v0}, Lfk2;-><init>(Lgk2;)V

    .line 21
    .line 22
    .line 23
    iput-object v1, p0, Lfk2;->b:Lfk2;

    .line 24
    .line 25
    return-object v1

    .line 26
    :cond_1
    const-string p0, "root"

    .line 27
    .line 28
    invoke-static {p0}, Lbt;->i(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    const/4 p0, 0x0

    .line 32
    return-object p0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 3

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p0, p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    instance-of v1, p1, Lfk2;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    if-nez v1, :cond_1

    .line 9
    .line 10
    return v2

    .line 11
    :cond_1
    check-cast p1, Lfk2;

    .line 12
    .line 13
    iget-object p1, p1, Lfk2;->a:Lgk2;

    .line 14
    .line 15
    iget-object p0, p0, Lfk2;->a:Lgk2;

    .line 16
    .line 17
    invoke-static {p0, p1}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result p0

    .line 21
    if-nez p0, :cond_2

    .line 22
    .line 23
    return v2

    .line 24
    :cond_2
    return v0
.end method

.method public final hashCode()I
    .locals 0

    .line 1
    iget-object p0, p0, Lfk2;->a:Lgk2;

    .line 2
    .line 3
    iget-object p0, p0, Lgk2;->a:Ljava/lang/String;

    .line 4
    .line 5
    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    return p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lfk2;->a:Lgk2;

    .line 2
    .line 3
    invoke-virtual {p0}, Lgk2;->toString()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method
