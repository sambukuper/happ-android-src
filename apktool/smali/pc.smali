.class public abstract Lpc;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# static fields
.field public static final a:Lox1;

.field public static final b:Lox1;

.field public static final c:Lz01;

.field public static final d:Lox1;

.field public static final e:Lox1;

.field public static final f:Lox1;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Lx;

    .line 2
    .line 3
    const/4 v1, 0x7

    .line 4
    invoke-direct {v0, v1}, Lx;-><init>(B)V

    .line 5
    .line 6
    .line 7
    new-instance v1, Lox1;

    .line 8
    .line 9
    const/4 v2, 0x0

    .line 10
    invoke-direct {v1, v0, v2}, Lox1;-><init>(Ldn2;B)V

    .line 11
    .line 12
    .line 13
    sput-object v1, Lpc;->a:Lox1;

    .line 14
    .line 15
    new-instance v0, Lx;

    .line 16
    .line 17
    const/16 v1, 0x8

    .line 18
    .line 19
    invoke-direct {v0, v1}, Lx;-><init>(B)V

    .line 20
    .line 21
    .line 22
    new-instance v1, Lox1;

    .line 23
    .line 24
    const/4 v2, 0x1

    .line 25
    invoke-direct {v1, v0, v2}, Lox1;-><init>(Ldn2;B)V

    .line 26
    .line 27
    .line 28
    sput-object v1, Lpc;->b:Lox1;

    .line 29
    .line 30
    new-instance v0, Ly2;

    .line 31
    .line 32
    const/16 v1, 0xa

    .line 33
    .line 34
    invoke-direct {v0, v1}, Ly2;-><init>(B)V

    .line 35
    .line 36
    .line 37
    new-instance v1, Lz01;

    .line 38
    .line 39
    invoke-direct {v1, v0}, Lz01;-><init>(Lgn2;)V

    .line 40
    .line 41
    .line 42
    sput-object v1, Lpc;->c:Lz01;

    .line 43
    .line 44
    new-instance v0, Lx;

    .line 45
    .line 46
    const/16 v1, 0x9

    .line 47
    .line 48
    invoke-direct {v0, v1}, Lx;-><init>(B)V

    .line 49
    .line 50
    .line 51
    new-instance v1, Lox1;

    .line 52
    .line 53
    invoke-direct {v1, v0, v2}, Lox1;-><init>(Ldn2;B)V

    .line 54
    .line 55
    .line 56
    sput-object v1, Lpc;->d:Lox1;

    .line 57
    .line 58
    new-instance v0, Lx;

    .line 59
    .line 60
    const/16 v1, 0xa

    .line 61
    .line 62
    invoke-direct {v0, v1}, Lx;-><init>(B)V

    .line 63
    .line 64
    .line 65
    new-instance v1, Lox1;

    .line 66
    .line 67
    invoke-direct {v1, v0, v2}, Lox1;-><init>(Ldn2;B)V

    .line 68
    .line 69
    .line 70
    sput-object v1, Lpc;->e:Lox1;

    .line 71
    .line 72
    new-instance v0, Lx;

    .line 73
    .line 74
    const/16 v1, 0xb

    .line 75
    .line 76
    invoke-direct {v0, v1}, Lx;-><init>(B)V

    .line 77
    .line 78
    .line 79
    new-instance v1, Lox1;

    .line 80
    .line 81
    invoke-direct {v1, v0, v2}, Lox1;-><init>(Ldn2;B)V

    .line 82
    .line 83
    .line 84
    sput-object v1, Lpc;->f:Lox1;

    .line 85
    .line 86
    return-void
.end method

.method public static final a(Ljava/lang/String;)V
    .locals 3

    .line 1
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 2
    .line 3
    new-instance v1, Ljava/lang/StringBuilder;

    .line 4
    .line 5
    const-string v2, "CompositionLocal "

    .line 6
    .line 7
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const-string p0, " not present"

    .line 14
    .line 15
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    invoke-direct {v0, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    throw v0
.end method
