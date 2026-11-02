.class public final Lr58;
.super Lbi7;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# instance fields
.field public c:Ljava/lang/CharSequence;

.field public d:Ljava/util/List;

.field public e:Lf88;

.field public f:Lo88;

.field public g:Z

.field public h:Z

.field public i:F

.field public j:F

.field public k:Lz24;

.field public l:Lfi2;

.field public m:J

.field public n:Lx78;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-static {}, Lkd7;->h()Ldd7;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Ldd7;->g()J

    .line 6
    .line 7
    .line 8
    move-result-wide v0

    .line 9
    invoke-direct {p0, v0, v1}, Lbi7;-><init>(J)V

    .line 10
    .line 11
    .line 12
    const/high16 v0, 0x7fc00000    # Float.NaN

    .line 13
    .line 14
    iput v0, p0, Lr58;->i:F

    .line 15
    .line 16
    iput v0, p0, Lr58;->j:F

    .line 17
    .line 18
    const/4 v0, 0x0

    .line 19
    const/16 v1, 0xf

    .line 20
    .line 21
    invoke-static {v0, v0, v0, v0, v1}, Ls31;->b(IIIII)J

    .line 22
    .line 23
    .line 24
    move-result-wide v0

    .line 25
    iput-wide v0, p0, Lr58;->m:J

    .line 26
    .line 27
    return-void
.end method


# virtual methods
.method public final a(Lbi7;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    check-cast p1, Lr58;

    .line 5
    .line 6
    iget-object v0, p1, Lr58;->c:Ljava/lang/CharSequence;

    .line 7
    .line 8
    iput-object v0, p0, Lr58;->c:Ljava/lang/CharSequence;

    .line 9
    .line 10
    iget-object v0, p1, Lr58;->d:Ljava/util/List;

    .line 11
    .line 12
    iput-object v0, p0, Lr58;->d:Ljava/util/List;

    .line 13
    .line 14
    iget-object v0, p1, Lr58;->e:Lf88;

    .line 15
    .line 16
    iput-object v0, p0, Lr58;->e:Lf88;

    .line 17
    .line 18
    iget-object v0, p1, Lr58;->f:Lo88;

    .line 19
    .line 20
    iput-object v0, p0, Lr58;->f:Lo88;

    .line 21
    .line 22
    iget-boolean v0, p1, Lr58;->g:Z

    .line 23
    .line 24
    iput-boolean v0, p0, Lr58;->g:Z

    .line 25
    .line 26
    iget-boolean v0, p1, Lr58;->h:Z

    .line 27
    .line 28
    iput-boolean v0, p0, Lr58;->h:Z

    .line 29
    .line 30
    iget v0, p1, Lr58;->i:F

    .line 31
    .line 32
    iput v0, p0, Lr58;->i:F

    .line 33
    .line 34
    iget v0, p1, Lr58;->j:F

    .line 35
    .line 36
    iput v0, p0, Lr58;->j:F

    .line 37
    .line 38
    iget-object v0, p1, Lr58;->k:Lz24;

    .line 39
    .line 40
    iput-object v0, p0, Lr58;->k:Lz24;

    .line 41
    .line 42
    iget-object v0, p1, Lr58;->l:Lfi2;

    .line 43
    .line 44
    iput-object v0, p0, Lr58;->l:Lfi2;

    .line 45
    .line 46
    iget-wide v0, p1, Lr58;->m:J

    .line 47
    .line 48
    iput-wide v0, p0, Lr58;->m:J

    .line 49
    .line 50
    iget-object p1, p1, Lr58;->n:Lx78;

    .line 51
    .line 52
    iput-object p1, p0, Lr58;->n:Lx78;

    .line 53
    .line 54
    return-void
.end method

.method public final b()Lbi7;
    .locals 0

    .line 1
    new-instance p0, Lr58;

    .line 2
    .line 3
    invoke-direct {p0}, Lr58;-><init>()V

    .line 4
    .line 5
    .line 6
    return-object p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 13

    .line 1
    iget-object v0, p0, Lr58;->c:Ljava/lang/CharSequence;

    .line 2
    .line 3
    iget-object v1, p0, Lr58;->d:Ljava/util/List;

    .line 4
    .line 5
    iget-object v2, p0, Lr58;->e:Lf88;

    .line 6
    .line 7
    iget-object v3, p0, Lr58;->f:Lo88;

    .line 8
    .line 9
    iget-boolean v4, p0, Lr58;->g:Z

    .line 10
    .line 11
    iget-boolean v5, p0, Lr58;->h:Z

    .line 12
    .line 13
    iget v6, p0, Lr58;->i:F

    .line 14
    .line 15
    iget v7, p0, Lr58;->j:F

    .line 16
    .line 17
    iget-object v8, p0, Lr58;->k:Lz24;

    .line 18
    .line 19
    iget-object v9, p0, Lr58;->l:Lfi2;

    .line 20
    .line 21
    iget-wide v10, p0, Lr58;->m:J

    .line 22
    .line 23
    invoke-static {v10, v11}, Lq31;->l(J)Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v10

    .line 27
    iget-object p0, p0, Lr58;->n:Lx78;

    .line 28
    .line 29
    new-instance v11, Ljava/lang/StringBuilder;

    .line 30
    .line 31
    const-string v12, "CacheRecord(visualText="

    .line 32
    .line 33
    invoke-direct {v11, v12}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    .line 39
    const-string v0, ", annotations="

    .line 40
    .line 41
    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 42
    .line 43
    .line 44
    invoke-virtual {v11, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    const-string v0, ", composition="

    .line 48
    .line 49
    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 50
    .line 51
    .line 52
    invoke-virtual {v11, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 53
    .line 54
    .line 55
    const-string v0, ", textStyle="

    .line 56
    .line 57
    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 58
    .line 59
    .line 60
    invoke-virtual {v11, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 61
    .line 62
    .line 63
    const-string v0, ", singleLine="

    .line 64
    .line 65
    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 66
    .line 67
    .line 68
    invoke-virtual {v11, v4}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 69
    .line 70
    .line 71
    const-string v0, ", softWrap="

    .line 72
    .line 73
    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 74
    .line 75
    .line 76
    invoke-virtual {v11, v5}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 77
    .line 78
    .line 79
    const-string v0, ", densityValue="

    .line 80
    .line 81
    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 82
    .line 83
    .line 84
    invoke-virtual {v11, v6}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 85
    .line 86
    .line 87
    const-string v0, ", fontScale="

    .line 88
    .line 89
    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 90
    .line 91
    .line 92
    invoke-virtual {v11, v7}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 93
    .line 94
    .line 95
    const-string v0, ", layoutDirection="

    .line 96
    .line 97
    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 98
    .line 99
    .line 100
    invoke-virtual {v11, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 101
    .line 102
    .line 103
    const-string v0, ", fontFamilyResolver="

    .line 104
    .line 105
    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 106
    .line 107
    .line 108
    invoke-virtual {v11, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 109
    .line 110
    .line 111
    const-string v0, ", constraints="

    .line 112
    .line 113
    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 114
    .line 115
    .line 116
    invoke-virtual {v11, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 117
    .line 118
    .line 119
    const-string v0, ", layoutResult="

    .line 120
    .line 121
    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 122
    .line 123
    .line 124
    invoke-virtual {v11, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 125
    .line 126
    .line 127
    const-string p0, ")"

    .line 128
    .line 129
    invoke-virtual {v11, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 130
    .line 131
    .line 132
    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 133
    .line 134
    .line 135
    move-result-object p0

    .line 136
    return-object p0
.end method
